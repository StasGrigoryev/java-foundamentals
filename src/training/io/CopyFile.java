package training.io;

import sun.lwawt.macosx.CInputMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int data = 0;

        try (FileInputStream fs = new FileInputStream("/Users/stanislavgrigoryev/Desktop/text.txt");
             FileOutputStream fo = new FileOutputStream("/Users/stanislavgrigoryev/Desktop/text2.txt")
        ) {
            while (fs.available() > 0) {
                data = fs.read();
                fo.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
