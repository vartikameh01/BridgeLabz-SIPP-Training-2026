import java.util.Scanner;
public class checknoisveorve {
    static boolean isPositive(int num) {
        return num >= 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i]))
                    System.out.println(arr[i] + " is Positive and Even");
                else
                    System.out.println(arr[i] + " is Positive and Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First element is Greater than Last element");
        else if (result == 0)
            System.out.println("First element is Equal to Last element");
        else
            System.out.println("First element is Less than Last element");
    }
}