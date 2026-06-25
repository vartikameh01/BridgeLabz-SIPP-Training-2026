class BankAccount {
    static String bankName = "SBI";
    static int count = 0;

    final int accountNumber;
    String accountHolder;

    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        count++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts = " + count);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println(bankName + " " + accountHolder + " " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Rahul", 101);
        a.display();
        BankAccount.getTotalAccounts();
    }
}