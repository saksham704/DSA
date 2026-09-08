public class EquilibriumIndex {

    public static int equilibriumIndexPrefixSum(int[] arr) {
        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Find equilibrium index
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            int rightSum = prefixSum[n - 1] - prefixSum[i];

            if (leftSum == rightSum)
                return i;
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println("Equilibrium Index: " + equilibriumIndexPrefixSum(arr));
    }
}

