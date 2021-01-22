package exerciseSectionEight.bankApp;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("BankOfAmerica");

        bank.addBranch("NycDepartment");
        bank.addCustomer("NycDepartment", "James LeBron",25.00);
        bank.addCustomer("NycDepartment", "Steve Jobs",50.00);
        bank.addCustomer("NycDepartment", "John Lennon",20.00);

        bank.addBranch("LaDepartment");
        bank.addCustomer("LaDepartment","Stefan Curry", 20.00);
        bank.addCustomer("LaDepartment","Abraham Lincoln", 25.00);
        bank.addCustomer("LaDepartment","Casey Neistat", 50.00);

        bank.addCustomerTransaction("NycDepartment", "James LeBron", 5.00);
        bank.addCustomerTransaction("NycDepartment", "James LeBron", 5.00);
        bank.addCustomerTransaction("NycDepartment", "Steve Jobs", 10.00);
        bank.addCustomerTransaction("NycDepartment", "Steve Jobs", 10.00);
        bank.addCustomerTransaction("NycDepartment", "John Lennon", 25.00);

        bank.addCustomerTransaction("LaDepartment", "Casey Neistat", 50.00);
        bank.addCustomerTransaction("LaDepartment", "Casey Neistat", 30.00);
        bank.addCustomerTransaction("LaDepartment", "Abraham Lincoln", 10.00);
        bank.addCustomerTransaction("LaDepartment", "Abraham Lincoln", 10.00);
        bank.addCustomerTransaction("LaDepartment", "Stefan Curry", 20.00);
        bank.addCustomerTransaction("LaDepartment", "Stefan Curry", 30.00);
        bank.addCustomerTransaction("LaDepartment", "Stefan Curry", 40.00);

        bank.listCustomers("NycDepartment", true);


        if (!bank.addBranch("NycDepartment")){
            System.out.println("Branch already exist");
        }
        if (!bank.addCustomerTransaction("NycDepartment","Greg Douglas", 50.00)){
            System.out.println("No such customer at this branch");
        }
        if (!bank.addCustomer("LaDepartment","Casey Neistat", 20.00)) {
            System.out.println("Already exists");
        }



    }
}
