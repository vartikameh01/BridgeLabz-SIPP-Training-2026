import java.util.Scanner;
public class shortCalendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month and year (e.g., 07 2005): ");
        int m = in.nextInt(), y = in.nextInt();
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {0, 31, ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int startDay = (1 + x + 31 * m0 / 12) % 7;
        System.out.println("\n  " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) System.out.print("    ");

        for (int d = 1; d <= days[m]; d++) {
            System.out.printf("%3d ", d);
            if ((d + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}