import java.util.*;
public class maximumSum {
    static int maxSum(int arr[], int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > max)
                max = sum;
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(maxSum(arr, k));
    }
}