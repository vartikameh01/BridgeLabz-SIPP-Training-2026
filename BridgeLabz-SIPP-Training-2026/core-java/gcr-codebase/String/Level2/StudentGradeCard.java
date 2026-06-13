public class StudentGradeCard {
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10;
            }
        }

        return marks;
    }
    public static double[][] calculateResult(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }
    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double per = result[i][2];

            if (per >= 80)
                grade[i] = "A";
            else if (per >= 70)
                grade[i] = "B";
            else if (per >= 60)
                grade[i] = "C";
            else if (per >= 50)
                grade[i] = "D";
            else if (per >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        return grade;
    }
    public static void display(int[][] marks, double[][] result, String[] grade) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i]);
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] marks = generateMarks(students);

        double[][] result = calculateResult(marks);

        String[] grade = calculateGrade(result);

        display(marks, result, grade);
    }
}