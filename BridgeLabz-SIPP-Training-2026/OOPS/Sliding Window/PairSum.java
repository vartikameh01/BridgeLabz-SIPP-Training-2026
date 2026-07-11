import java.util.*;
public class PairSum {

    static void pairSum(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }

            if (sum < target)
                left++;
            else
                right--;
        }

        System.out.println("Pair Not Found");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        pairSum(arr, target);
    }
}