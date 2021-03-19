package dp;

import java.util.Arrays;

/**
 * Leetcode 377:
 * 给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。
 * 请你从 nums 中找出并返回总和为 target 的元素组合的个数。
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
