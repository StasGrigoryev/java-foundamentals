package FuctionalProg.beginning;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;

public class Main {


    public static void main(String[] args) throws Exception{

        Main main = new Main();
        Employee e1 = new Employee("John Doe", 21);
        Employee e2 = new Employee("Rick Hamstring", 40);
        Employee e3 = new Employee("Adam Denials", 34);
        Employee e4 = new Employee("Bob Jones", 20);
        Employee e5 = new Employee("Clayton Sparrow", 30);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);



        Function<Employee, String> getFirstName = emp
                -> (emp.getName().substring(0, emp.getName().indexOf(' ')));
        Function<Employee, String> getLastName = emp
                -> (emp.getName().substring(emp.getName().indexOf(' ') + 1));

        String  lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Random rand = new Random();
        for(Employee e : employees) {
            if (rand.nextBoolean()) {
                System.out.println(getAName(getFirstName, e));
            } else
                System.out.println(getAName(getLastName,e));
        }

        Function<Employee, String> toUpperCase = e -> e.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = toUpperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee e) -> {
            return name.concat(" " + e.getAge());
        };

        String upperName = toUpperCase.apply(employees.get(3));
        System.out.println(concatAge.apply(upperName, employees.get(1)));

//        // we implemented interface Runnable and his only method run()
//        // so returned type is Runnable? not void?
//        // Does that mean that returned type is defined by the interface
//        // to which the method belongs?
//        Runnable r = () -> System.out.println("Hello!");

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10 ));
//
//        BinaryOperator<Integer> addition = (x, y) -> x + y;
//        // wtf is this? idk yet, but I'll find out
//        BinaryOperator<Integer> addition2 = Integer::sum;

//        IntPredicate older21 = i -> i > 21;
//        IntPredicate younger40 = i -> i < 40;
//        //using "and" method to check both conditions
//        //first we negating result of the first condition
//        System.out.println(older21.negate().and(younger40).test(18));
//
//
//        printByAge( "Employees over 21", employees, emp -> emp.getAge() > 21);
//        printByAge( "Employees 30 and over", employees, emp -> emp.getAge() >= 30);


//
//        Comparator<Employee> compareByName = (emp1,emp2) ->
//                emp1.getName().compareTo(emp2.getName());
//        //still don't know this "::" syntax, intellij suggestion
//        Comparator<Employee> compareByAge = Comparator.comparingInt(Employee::getAge);
//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//        Random random = new Random();
//        Supplier<Integer> randSup = () -> random.nextInt(100);
//        for (int i = 0; i < 10; i ++) {
//            System.out.println(randSup.get());
//        }
//
//        employees.forEach(emp -> {
//            String lastName = emp.getName().substring(emp.getName().indexOf(' ')+1);
//            System.out.println("The last name is " + lastName);
//        });




    }

    public static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }

    public static void printByAge(String message, List<Employee> employees,
                                  Predicate<Employee> predicate) {
        System.out.println("=========" + message + "=========");
        employees.forEach(emp -> {
                        if(predicate.test(emp)) System.out.println(emp);
        });
    }

    public final static void doStringStuff(UpperConcat uc, String s1, String s2) {
        uc.upperAndConcat(s1, s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getAge() + " y.o.";
    }
}

interface UpperConcat {
    void upperAndConcat(String s1, String s2);
}


