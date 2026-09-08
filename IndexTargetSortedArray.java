public class IndexTargetSortedArray {

    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right}; // returning indices
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return new int[]{-1, -1}; // if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
