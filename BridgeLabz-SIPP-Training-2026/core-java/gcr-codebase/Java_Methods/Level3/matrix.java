import java.util.*;
public class matrix {
    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);

        return m;
    }
    static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];

        return sum;
    }
    static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] diff = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                diff[i][j] = a[i][j] - b[i][j];

        return diff;
    }
    static int[][] multiply(int[][] a, int[][] b) {
        int[][] mul = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    mul[i][j] += a[i][k] * b[k][j];

        return mul;
    }
    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nAddition:");
        printMatrix(add(A, B));

        System.out.println("\nSubtraction:");
        printMatrix(subtract(A, B));

        System.out.println("\nMultiplication:");
        printMatrix(multiply(A, B));
    }
}