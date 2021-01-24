package FuctionalProg.streams;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
