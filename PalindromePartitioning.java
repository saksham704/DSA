import java.util.*;
public class PalindromePartitioning{
    public int minCut(String s){
        int n = s.length();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return recur(s, 0, dp) - 1;
    }
    public int recur(String s, int i, int dp[]){
        if(i == s.length()){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        String temp = "";
        int min_cost = Integer.MAX_VALUE;
        for(int j = i; j < s.length(); j++){
            temp += s.charAt(j);
            if(isPalindrome(temp)){
                int cost = 1 + recur(s, j + 1, dp);
                min_cost = Math.min(min_cost, cost);
            }
        }
        return dp[i] = min_cost;
    }
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromePartitioning obj = new PalindromePartitioning();
        String s = "aab";
        System.out.println(obj.minCut(s));
    }
   
}
