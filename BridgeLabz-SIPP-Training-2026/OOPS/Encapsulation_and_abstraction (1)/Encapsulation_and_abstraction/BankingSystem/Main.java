public class Main {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(
                "SA101",
                "Mahak",
                10000,
                5
        );
        sa.deposit(2000);
        sa.withdraw(1500);
        System.out.println("\nSavings Account Details");
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());
        CurrentAccount ca = new CurrentAccount(
                "CA201",
                "Priyanshi",
                20000,
                2
        );
        ca.deposit(3000);
        ca.withdraw(4000);
        System.out.println("\nCurrent Account Details");
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}