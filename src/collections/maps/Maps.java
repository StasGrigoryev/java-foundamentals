package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String,String> langs = new HashMap<>();

        if (langs.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            langs.put("Java", "a compiled high level, object oriented, " +
                    "platform independent programming language");
            System.out.println("Java added successfully");
        }
        langs.put("Python", "an interpreted, object-oriented, high level " +
                "programming language with dynamic semantics");
        langs.put("Algol", "an algorithmic language");
        langs.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        langs.put("Lisp", "Therein lies madness");

//        System.out.printf("Lisp removed. Previous value: \"%s\"%n",
//                                                    langs.remove("Lisp"));
        if(langs.remove("Lisp","an algorithmic language")) {
            System.out.println("Lisp removed");
        } else {
            System.out.println("Lisp not removed. Key/value pair not found");
        }

        if (langs.containsKey("Java")) {
            System.out.println("Already in the map");
        } else {
            System.out.println(langs.put("Java", "I Love Java"));
        }
        System.out.println(langs.get("Java"));

        System.out.println(langs.replace("Lisp", "a functional programming language " +
                "with imperative features"));
        System.out.println(langs.replace("Scala", "this will not be added"));
        System.out.println(langs.replace("Algol","an algorithmic language",
                                        "the most awesome algorithmic language"));


        System.out.println("================================");
        for (String key : langs.keySet()) {
            System.out.println(key + ": " + langs.get(key));
        }
    }
}
