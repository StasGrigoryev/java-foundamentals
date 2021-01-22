package serialization;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("mySong.txt");
            fw.write("Coldplay - Fix You");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
