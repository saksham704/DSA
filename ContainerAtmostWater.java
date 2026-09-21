public class ContainerAtmostWater {
    public int maxAre(int[] height){
        int i=0, j= height.length-1;
        int ans = 0;
        while(i<j){
            ans = Math.max(ans, Math.min(height[i], height[j]) * (j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
                }
    }
        return ans;
    }
    public static void main(String[] args) {
        ContainerAtmostWater obj = new ContainerAtmostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = obj.maxAre(height);
        System.out.println(result);
    }
}
