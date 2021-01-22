package challenges.problems.bankAccount;

public class Account {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public Account(long accountNumber, double balance, String customerName, String eMail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        System.out.println("Eleonora Dizon has been added to database");
    }

    public Account() {
        this (1212312344123L, 120000.00d,
                "Maria Tereza", "mariatereza@mail.post", "+3190155121");
        // called overloaded constructor. That line always should be the first line of the constructor
    }

    public void setAccountNumber (long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber () {
        return accountNumber;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName () {
        return customerName;
    }

    public void setEmail (String eMail) {
        this.eMail = eMail;
    }

    public String getEmail () {
        return eMail;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void depositFunds (double depositAmount) {
        this.balance += depositAmount;
        System.out.println("The money has been deposited successfully. Your balance is " +
                String.format("%.2f", this.balance));
    }

    public void withdrawFunds (double withdrawAmount) {
        if (withdrawAmount < this.balance) {
            this.balance -= withdrawAmount;
            System.out.println("Please take your money. Balance is " + this.balance);
        } else System.out.println("Your balance is less than you want to withdraw. Balance: " + this.balance);
    }
}
