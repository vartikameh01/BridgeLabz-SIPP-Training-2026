class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String n, int a, double b) {
        accountHolder = n;
        accountNumber = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Rahul", 1234, 5000);
        b.deposit(1000);
        b.withdraw(2000);
        b.display();
    }
}