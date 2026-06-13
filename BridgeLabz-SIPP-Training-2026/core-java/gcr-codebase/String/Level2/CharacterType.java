import java.util.Scanner;
public class CharacterType {
    static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
            return "Vowel";
        else if (ch >= 'a' && ch <= 'z')
            return "Consonant";
        else
            return "Not a Letter";
    }

    static String[][] findType(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = check(str.charAt(i));
        }

        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Character\tType");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] result = findType(str);
         System.out.println(result);
       
    }
}