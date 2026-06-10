import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("First number is largest");
        }

        if(num2 > num1 && num2 > num3) {
            System.out.println("Second number is largest");
        }

        if(num3 > num1 && num3 > num2) {
            System.out.println("Third number is largest");
        }

        sc.close();
    }
}
