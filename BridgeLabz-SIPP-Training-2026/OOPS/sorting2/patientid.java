import java.util.*;

public class patientid {

    static int temp[];

    static void mergeSort(int arr[], int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        int i = l;
        int j = mid + 1;
        int k = l;

        while (i <= mid && j <= r) {

            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (i = l; i <= r; i++)
            arr[i] = temp[i];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        temp = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}