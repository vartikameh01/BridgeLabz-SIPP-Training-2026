import java.util.Random;
public class Bonus {
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2]; // 10 rows, 2 columns (Index 0: Salary, Index 1: Years)
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            // Generates years of service between 1 and 10
            data[i][1] = 1 + rand.nextInt(10); 
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] empData) {
        double[][] results = new double[10][2]; // Index 0: New Salary, Index 1: Bonus Amount

        for (int i = 0; i < 10; i++) {
            double oldSalary = empData[i][0];
            double years = empData[i][1];
            double bonusPercent;

            // a. 5% if more than 5 years, otherwise 2%
            if (years > 5) {
                bonusPercent = 0.05;
            } else {
                bonusPercent = 0.02;
            }

            double bonusAmount = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonusAmount;

            results[i][0] = newSalary;
            results[i][1] = bonusAmount;
        }
        return results;
    }
    public static void displaySummaryTable(double[][] empData, double[][] results) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-10s\n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus");
        System.out.println("-------------------");

        for (int i = 0; i < 10; i++) {
            double oldSal = empData[i][0];
            double years = empData[i][1];
            double newSal = results[i][0];
            double bonus = results[i][1];

            totalOldSalary += oldSal;
            totalNewSalary += newSal;
            totalBonus += bonus;

            System.out.printf("Emp %-6d $%-11.2f %-10.0f $%-11.2f $%-9.2f\n", (i + 1), oldSal, years, newSal, bonus);
        }

        System.out.println("-------------------");
        System.out.printf("%-10s $%-11.2f %-10s $%-11.2f $%-9.2f\n", "TOTALS:", totalOldSalary, "", totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] calculations = calculateBonusAndNewSalary(employeeData);
        displaySummaryTable(employeeData, calculations);
    }
}