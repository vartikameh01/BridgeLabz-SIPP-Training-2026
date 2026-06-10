import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int count = sc.nextInt();

        while(count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Rocket Launched!");

        sc.close();
    }
}