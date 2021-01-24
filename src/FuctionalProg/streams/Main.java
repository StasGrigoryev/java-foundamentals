package FuctionalProg.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         List<String> bingoNumbers = Arrays.asList(
                 "N40", "N36",
                 "B12", "B6",
                 "G53", "G49", "G60", "G50", "g64",
                 "I27", "I17", "I21",
                 "O71");

//         List<String> gNumbers = new ArrayList<>();
//
//         bingoNumbers.forEach(number -> {
//             if (number.toUpperCase().startsWith("G")) {
//                 gNumbers.add(number);
////                 System.out.println(number);
//             }
//         });
//
//         gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//         gNumbers.forEach(s -> System.out.println(s));

//         bingoNumbers
//                 .stream()
//                 .map(String::toUpperCase)
//                 .filter(s -> s.startsWith("G"))
//                 .sorted()
//                 .forEach(System.out::println);
//
//        Stream<String> ioNumberStrings = Stream.of("I26", "I17", "I29", "071");
//        Stream<String> inNmberStrings = Stream.of("N40", "N36", "I26", "I17", "I29", "071");
//        Stream<String> concatStream = Stream.concat(ioNumberStrings,inNmberStrings);
//        System.out.println("---------------------");
//        System.out.println(concatStream
//                .distinct()
//                .peek(System.out::println)
//                .count());

        Employee john = new Employee("John Doe", 30);
        Employee killian = new Employee("Killian Murphy", 25);
        Employee jack = new Employee("Jack Gilbert", 40);
        Employee alison = new Employee("Alison Meg", 24);

        Department hr = new Department("Human resources");
        hr.addEmployee(killian);
        hr.addEmployee(jack);
        hr.addEmployee(alison);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        //following produces a stream containing all employees in all departments
        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .forEach(System.out::println);

        List<String> sortedGNumbers = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(n -> n.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

        for (String s : sortedGNumbers) {
            System.out.println(s);
        }

        List<String> sortedGNumbers1 = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(n -> n.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

    }

    Predicate<Integer> isOdd = i -> i % 2 != 0;

    public static String everySecondChar(String source, Predicate<Integer> p) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            if(p.test(i)) {
                sb.append(source).charAt(i);
            }
        }
        return sb.toString();
    }




}
