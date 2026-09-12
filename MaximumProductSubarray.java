public class MaximumProductSubarray {
    public int maxProduct(int[] nums){
        int pre = 1, suf = 1, res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(pre == 0)
                 pre = 1;
            if(suf == 0)
                 suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[nums.length - 1 - i];
            res = Math.max(res, Math.max(pre, suf));
        }
        return res;
    
    }
    public static void main(String[] args) {
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int[] nums = {2,3,-2,4};
        int result = obj.maxProduct(nums);
        System.out.println(result);
    }
}
