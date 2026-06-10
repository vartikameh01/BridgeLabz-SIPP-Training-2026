import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if(n >= 0) {

            int sum = 0;
            int i = 1;

            while(i <= n) {
                sum = sum + i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formulaSum);

            if(sum == formulaSum) {
                System.out.println("Both answers are correct.");
            }

        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }
}