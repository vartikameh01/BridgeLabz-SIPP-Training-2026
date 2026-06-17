import java.util.Scanner;
public class NumberChecherMath {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }
    public static int sumDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }
    public static int sumSquareDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);

        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Count of Digits = " + countDigits(num));

        System.out.println("Sum of Digits = " +
                sumDigits(digits));

        System.out.println("Sum of Squares of Digits = " +
                sumSquareDigits(digits));

        System.out.println("Harshad Number = " +
                isHarshad(num, digits));

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit\tFrequency");

        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] + "\t" +
                        frequency[i][1]
                );
            }
        }
    }
}