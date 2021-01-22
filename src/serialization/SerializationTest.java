package serialization;

import java.io.*;

public class SerializationTest {

    static class Box implements Serializable {

        private int height;
        private int width;

        public Box (int height, int width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public String toString() {
            return "Object " + this + " of class "  + this.getClass().getSimpleName() + " with hashcode " + "\n" +
                    "height: " + this.height + " and width: " + this.width;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Box box = new Box(10,10);

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("box.ser"));
//        oos.writeObject(box);
//        System.out.println(box);
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("box.ser"));
            Box boxRestored = (Box) ois.readObject();
            System.out.println(boxRestored);
            ois.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
