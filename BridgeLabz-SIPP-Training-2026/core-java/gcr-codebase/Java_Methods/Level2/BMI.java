import java.util.Scanner;
public class BMI{
    static double calculateBMI(double weight, double height) {
        height = height / 100; // cm to meter
        return weight / (height * height);
    }

    static String getStatus(double bmi) {
        if (bmi <= 18.4)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal";
        else if (bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] person = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Weight: ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height(cm): ");
            person[i][1] = sc.nextDouble();

            person[i][2] = calculateBMI(person[i][0], person[i][1]);
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                    person[i][0],
                    person[i][1],
                    person[i][2],
                    getStatus(person[i][2]));
        }
    }
}