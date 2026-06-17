import java.util.Scanner;

public class Trigonometry {

    public static double[] calculateTrigonometricFunctions(double angle) {

        double radian = Math.toRadians(angle);

        double sin = Math.sin(radian);

        double cos = Math.cos(radian);

        double tan = Math.tan(radian);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");

        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);

        System.out.println("Cos = " + result[1]);

        System.out.println("Tan = " + result[2]);

        sc.close();
    }
}