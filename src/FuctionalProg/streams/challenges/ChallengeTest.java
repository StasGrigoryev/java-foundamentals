package FuctionalProg.streams.challenges;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ChallengeTest {
    public static void main(String[] args) {
        everySecond("1234567890",everySecondNumber);

        String iLoveJava = iLiveJavaSupplier.get();
        System.out.println(iLoveJava);

        List<String> jacob = Arrays.asList(
                "Amelia",
                "olivia",
                "Any",
                "Emmy",
                "Lord",
                "ptushkin",
                "Mike",
                "Eleven",
                "Justin",
                "maxine",
                "Clark",
                "Chloe",
                "lana",
                "Lex",
                "John",
                "Martha"
        );
//        jacob.stream()
//                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
//                .sorted()
//                .forEach(System.out::println);

        List<String> names = jacob.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .peek(System.out::println)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    static Function<String, String> everySecondNumber = source -> {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            if(i % 2 == 1) {
                sb.append(source.charAt(i));
            }
        }
        return sb.toString();
    };

    public static void everySecond(String source, Function<String,String> f) {
        System.out.println(f.apply(source));
    }

    static Supplier<String> iLiveJavaSupplier = () -> "I love Java";

    Comparator<String> stringComparator = Comparator.naturalOrder();

}
