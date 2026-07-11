import java.util.*;

public class Target{

    static boolean search(int mat[][], int r, int c, int target) {

        int left = 0;
        int right = r * c - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int row = mid / c;
            int col = mid % c;

            if (mat[row][col] == target)
                return true;

            if (mat[row][col] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println(search(mat, r, c, target));
    }
}