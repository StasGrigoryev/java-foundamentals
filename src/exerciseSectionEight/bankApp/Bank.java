package exerciseSectionEight.bankApp;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.bankName = name;
        this.branches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }
         return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addNewTransaction(customerName, transactionAmount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch((branchName));
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer name: " + branchCustomers.get(i).getName() + " [" + (i+1) + "]");
                if (showTransactions) {
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    System.out.println("Customer's transactions:");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1)  + "] Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        System.out.println("No branches with that name found");
        return false;
    }

}









