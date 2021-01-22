package challenges.problems.bankAccount;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(121231234412423L, 150000.00d,
                "Eleonora Dizon", "eleonoraDizon@mail.post", "+3190155101");

        account.depositFunds(400000.00d);
        account.withdrawFunds(100000.00d);
    }
}
