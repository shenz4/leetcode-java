/**
 * Leetcode 1：
 * 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
 * 和为目标值 的那 两个 整数，并返回它们的数组下标。
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
