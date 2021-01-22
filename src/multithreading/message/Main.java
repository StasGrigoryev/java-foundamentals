package multithreading.message;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}
    class Message {
        private String message;
        private boolean empty = true;

        public synchronized String read() {
            while(empty) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            empty = true;
            notifyAll();
            return message;
        }

        public synchronized void write(String message) {
            while(!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            empty = false;
            this.message = message;
            notifyAll();
        }

    }

    class Writer implements Runnable {
        private Message message;

        public Writer(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            String[] messages = {"Welcome to the city SEVENDAY",
                    "The most beautiful city",
                    "In the world",
                    "We glad to meet you",
                    "Enjoy your life"};

            Random random = new Random();
            for (int i = 0; i  < messages.length; i++) {
                message.write(messages[i]);
                try {
                    sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            message.write("Finished");
        }
    }

    class Reader implements Runnable {
        private Message message;

        public Reader(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            Random random = new Random();

            for (String lastMessage = message.read(); !lastMessage.equals("Finished"); lastMessage = message.read()){
                System.out.println(lastMessage);
                try {
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

