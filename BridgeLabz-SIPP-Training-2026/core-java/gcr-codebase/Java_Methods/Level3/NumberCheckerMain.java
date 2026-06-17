import java.util.Scanner;
public class NumberCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str = String.valueOf(num);

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");

        if (str.contains("0"))
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
    }
}