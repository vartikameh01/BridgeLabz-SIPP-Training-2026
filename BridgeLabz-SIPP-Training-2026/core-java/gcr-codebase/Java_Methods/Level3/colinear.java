import java.util.Scanner;
public class colinear{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        double x1 = in.nextDouble(), y1 = in.nextDouble();
        double x2 = in.nextDouble(), y2 = in.nextDouble();
        double x3 = in.nextDouble(), y3 = in.nextDouble();
        boolean collinearBySlope = (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
        double area = 0.5 * Math.abs((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2));
        boolean collinearByArea = (area == 0);

        System.out.println("\n--- Results ---");
        System.out.println("Collinear using Slope Formula: " + collinearBySlope);
        System.out.println("Area of Triangle: " + area);
        System.out.println("Collinear using Area Formula: " + collinearByArea);
    }
}