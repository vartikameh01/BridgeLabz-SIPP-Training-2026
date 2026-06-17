import java.util.Scanner;
public class factors {
    static int[] findFactors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    static int sumFactors(int[] factors) {
        int sum = 0;

        for (int f : factors)
            sum += f;

        return sum;
    }

    static long productFactors(int[] factors) {
        long product = 1;

        for (int f : factors)
            product *= f;

        return product;
    }

    static double cubeProductFactors(int[] factors) {
        double product = 1;

        for (int f : factors)
            product *= Math.pow(f, 3);

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nGreatest Factor = " +
                greatestFactor(factors));

        System.out.println("Sum of Factors = " +
                sumFactors(factors));

        System.out.println("Product of Factors = " +
                productFactors(factors));

        System.out.println("Product of Cubes of Factors = " +
                cubeProductFactors(factors));
    }
}