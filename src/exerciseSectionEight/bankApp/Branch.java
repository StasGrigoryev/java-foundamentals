package exerciseSectionEight.bankApp;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            return false;
        }
        customers.add(new Customer(customerName, initialAmount));
        return true;
    }

    public boolean addNewTransaction(String customerName, double transactionAmount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            findCustomer(customerName).addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }

}
