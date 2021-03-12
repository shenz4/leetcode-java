package dp;

import java.util.Arrays;

/**
 * Leetcode 377:
 */
public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        // 备忘录
        int[] dp = new  int[target+1];
        // base case
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int j = nums.length-1; j >= 0; j--) {
                int cur = nums[j];
                if (i >= cur){
                    dp[i] += dp[i-cur];
                }
            }
        }
        return dp[target];
    }
}
