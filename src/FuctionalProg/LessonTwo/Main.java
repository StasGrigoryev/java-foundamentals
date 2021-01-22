package FuctionalProg.LessonTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Snow", 19);
        Employee sarah = new Employee("Sarah Deachy", 29);
        Employee jack = new Employee("Jack Hill", 39);
        Employee solo = new Employee("Han Solo", 30);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(sarah);
        employees.add(jack);
        employees.add(solo);
        int i = 'A';
        System.out.write(i);



        Function<Employee,String> getLastName = (employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };

        Function<Employee,String> getFirstName = (employee) -> {
          return employee.getName().substring(0,employee.getName().indexOf(' '));
        };

//        for(Employee employee : employees) {
//            Random random = new Random();
//            if (random.nextBoolean()) {
//                System.out.println(getAName(getFirstName,employee));
//            } else {
//                System.out.println(getAName(getLastName,employee));
//            }
//        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String,String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);

        BiFunction<String, Employee, String> concatAge = (name, employee) -> {
            return name.concat(" " + employee.getAge());
        };
        String upperName = upperCase.apply(john);
        System.out.println(concatAge.apply(upperName,john));


        System.out.println(chainedFunction.apply(john));




    }
    private static String getAName(Function<Employee,String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
//        employees.forEach(employee -> System.out.println("This employee's name: " + employee.getName()));
//        printEmployeesByAge(employees,"Employees that younger than 30", employee -> employee.getAge() < 30);
//        printEmployeesByAge(employees,"Employees that older than 30", employee -> employee.getAge() >= 30);
//
//        IntPredicate greaterThanTen = i -> i > 10;
//        IntPredicate lessThan100 = i -> i < 100;
//        System.out.println(lessThan100.and(greaterThanTen).test(50)); // true
//
//    }
//    private static void printEmployeesByAge(List<Employee> employees, String text, Predicate<Employee> ageCondition) {
//        System.out.println(text + "\n================================");
//        for (Employee e : employees) {
//            if (ageCondition.test(e)) {
//                System.out.println(e.getName() + "'s age is: " + e.getAge());
//            }
//        }
//    }
//}
//
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
        return this.getName()  + " " + this.getAge();
    }

}