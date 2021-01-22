package exerciseSectionEight.bankApp;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransaction() {
        return transactions;
    }

    public void addTransaction(Double amount) {
        this.transactions.add(amount);
    }


}
