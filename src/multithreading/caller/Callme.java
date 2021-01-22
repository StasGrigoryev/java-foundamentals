package multithreading.caller;

public class Callme {

    private String msg;

    synchronized void call(String msg) {
        System.out.print("[" + msg );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    private Callme target;
    private String message;
    private Thread t;

    public Caller(Callme target, String message) {
        this.target = target;
        this.message = message;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(message);
    }
}

class Sync {
    public static void main(String[] args) {
        Callme callme = new Callme();
        Caller caller1 = new Caller(callme, "Welcome");
        Caller caller2 = new Caller(callme,"To Sweet");
        Caller caller3 = new Caller(callme,"Home Alabama");
    }
}
