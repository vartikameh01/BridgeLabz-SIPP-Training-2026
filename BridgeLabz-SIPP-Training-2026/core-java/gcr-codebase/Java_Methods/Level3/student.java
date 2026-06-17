import java.util.Scanner;
public class student{
    static int[][] generateScores(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 90) + 10; // 2-digit score
            }
        }
        return marks;
    }
    static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double per = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = per;
        }
        return result;
    }
    static void display(int[][] marks, double[][] result) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer%");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateScores(n);
        double[][] result = calculateResults(marks);

        display(marks, result);
    }
}