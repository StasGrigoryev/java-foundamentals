package challenges.problems.bankAccount;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("defaultName", 100000.0,"deafult@email.com");
    }

    public VipCustomer (String name, double limit) {
        this(name, limit,"default@email.com");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
