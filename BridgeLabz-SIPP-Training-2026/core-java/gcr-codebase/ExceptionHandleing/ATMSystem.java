class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {

        super(message);
    }
}

public class ATMSystem {

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance.");
        }

        balance = balance - amount;

        System.out.println(
                "Remaining Balance = ₹" + balance);
    }

    public static void main(String[] args) {

        int balance = 5000;

        int amount = 8000;

        try {

            withdraw(balance, amount);

        }

        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

            System.out.println(
                    "Available Balance = ₹"
                            + balance);

            System.out.println(
                    "Requested Amount = ₹"
                            + amount);
        }
    }
}