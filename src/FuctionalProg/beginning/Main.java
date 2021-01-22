package FuctionalProg.beginning;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

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

//        // we implemented interface Runnable and his only method run()
//        // so returned type is Runnable? not void?
//        // Does that mean that returned type is defined by the interface
//        // to which the method belongs?
//        Runnable r = () -> System.out.println("Hello!");
//
//        BinaryOperator<Integer> addition = (x, y) -> x + y;
//        // wtf is this? idk yet, but I'll find out
//        BinaryOperator<Integer> addition2 = Integer::sum;

        IntPredicate older21 = i -> i > 21;
        IntPredicate younger40 = i -> i < 40;

        printByAge( "Employees over 21", employees, emp -> emp.getAge() < 30);
        printByAge( "Employees 30 and over", employees, emp -> emp.getAge() >= 30);

        Comparator<Employee> compareByName = (emp1,emp2) ->
                emp1.getName().compareTo(emp2.getName());
        //still don't know this "::" syntax, intellij suggestion
        Comparator<Employee> compareByAge = Comparator.comparingInt(Employee::getAge);
        Collections.sort(employees, Comparator.comparing(Employee::getName));








    }

    public static void printByAge(String message, List<Employee> employees, Predicate<Employee> predicate) {
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


