import java.util.*;

public class fligth {

    static void quickSort(int arr[], int low, int high) {

        if (low >= high)
            return;

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high - 1 && arr[i] <= pivot)
                i++;

            while (j >= low + 1 && arr[j] > pivot)
                j--;

            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        quickSort(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}