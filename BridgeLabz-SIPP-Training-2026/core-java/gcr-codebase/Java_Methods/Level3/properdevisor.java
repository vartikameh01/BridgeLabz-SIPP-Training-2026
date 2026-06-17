import java.util.Scanner;
public class properdevisor {
    static int sumFactors(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        return sum;
    }

    static boolean isPerfect(int n) {
        return sumFactors(n) == n;
    }

    static boolean isAbundant(int n) {
        return sumFactors(n) > n;
    }

    static boolean isDeficient(int n) {
        return sumFactors(n) < n;
    }

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));
    }
}