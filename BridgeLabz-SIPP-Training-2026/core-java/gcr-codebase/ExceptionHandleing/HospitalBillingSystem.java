import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static int[] patientBills = {5000, 7000, 9000};

    static void calculateBill(int totalAmount, int items) {

        try {
            int result = totalAmount / items;
            System.out.println("Bill per item = ₹" + result);

        } catch (ArithmeticException e) {
            System.out.println("Bills cannot have zero items.");
        }
    }

    static void getPatientBill(int index) {

        try {
            System.out.println("Patient Bill = ₹" + patientBills[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        }
    }

    static void readAge() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");

            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Age = " + age);

        } catch (NumberFormatException e) {

            System.out.println("Please enter numbers only.");
        }
    }

    static void processPayment(int balance, int amount)
            throws InsufficientFundsException {

        if (amount > balance) {

            throw new InsufficientFundsException(
                    "Payment failed. Not enough balance.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        calculateBill(5000, 0);

        getPatientBill(10);

        readAge();

        try {

            processPayment(2000, 5000);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}