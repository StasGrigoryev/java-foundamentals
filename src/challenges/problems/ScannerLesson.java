package challenges.problems;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class ScannerLesson {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(reverseString(name));

    }

    public static String reverseString (String word) {

        word = word.toLowerCase();
        String newWord = "";
        while (word.length() > 0) {

            newWord += word.charAt(word.length() - 1);
            word = word.substring(0, word.length() - 1);
        }
        return newWord.substring(0, 1).toUpperCase() + newWord.substring(1);
    }
}
