import java.util.*;

public class RangeSum {

    public static int rangesum(int arr[], int L, int R){
        int sum = 0;
        for(int i = L; i <= R; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int[] prefixsum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) { 
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix[] = prefixsum(arr);

        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));

        System.out.print("Enter starting index (L): ");
        int L = sc.nextInt();

        System.out.print("Enter ending index (R): ");
        int R = sc.nextInt();

        int result = rangesum(arr, L, R);
        System.out.println("Range Sum is: " + result);

        sc.close();
    }
}
