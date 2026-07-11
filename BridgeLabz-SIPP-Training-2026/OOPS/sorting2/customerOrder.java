import java.util.*;

public class customerOrder {

    static void mergeSort(int arr[], int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            int left[] = Arrays.copyOfRange(arr, l, m + 1);
            int right[] = Arrays.copyOfRange(arr, m + 1, r + 1);

            int i = 0, j = 0, k = l;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j])
                    arr[k++] = left[i++];
                else
                    arr[k++] = right[j++];
            }

            while (i < left.length)
                arr[k++] = left[i++];

            while (j < right.length)
                arr[k++] = right[j++];
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}