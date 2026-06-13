import java.util.Scanner;

public class TrimString {
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] positions = trimSpaces(text);

        String myTrim = createSubstring(text, positions[0], positions[1]);
        String builtInTrim = text.trim();

        System.out.println("String after custom trim: " + myTrim);
        System.out.println("String after built-in trim: " + builtInTrim);

        boolean same = compareStrings(myTrim, builtInTrim);
        System.out.println("Both strings are same: " + same);
    }
}