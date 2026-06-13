import java.util.Scanner;
public class StringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int myLength = findLength(str);

        System.out.println("Length (User Method) = " + myLength);
        System.out.println("Length (Built-in) = " + str.length());
    }
}