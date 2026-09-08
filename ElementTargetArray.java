public class ElementTargetArray {
    public static int[] twoSumPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]}; // values
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumPair(arr, target);
        System.out.println("Pair: " + result[0] + " , " + result[1]);
    }
}

