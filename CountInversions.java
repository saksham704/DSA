import java.util.*;

public class CountInversions {

    public static long mergeSort(int arr[], int low, int high) {
        long count = 0;

        if (low < high) {
            int mid = low + (high - low) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }

        return count;
    }

    public static long merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        long count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);

                // Important inversion formula
                count += (mid - left + 1);

                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count;
    }

    public static long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};

        System.out.println(inversionCount(arr));
    }
}