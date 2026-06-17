import java.util.Scanner;

public class distance {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1 for Point 1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 for Point 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = getDistance(x1, y1, x2, y2);
        double[] equationParams = getLineEquation(x1, y1, x2, y2);
        
        double slope = equationParams[0];
        double intercept = equationParams[1];

        System.out.printf("\nEuclidean Distance: %.4f\n", distance);
        System.out.printf("Equation of the Line: y = %.2fx + (%.2f)\n", slope, intercept);
        
        input.close();
    }
}