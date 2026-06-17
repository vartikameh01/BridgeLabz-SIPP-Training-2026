import java.util.Scanner;
public class sumofnnaturalno {
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println("Length without length(): " + findLength(str));
        System.out.println("Length using length(): " + str.length());
    }
}