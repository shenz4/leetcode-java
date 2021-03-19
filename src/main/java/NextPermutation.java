import java.util.Arrays;

/**
 * Leetcode 31:
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 1){
            return;
        }
        int n = nums.length;

        int i;
        for (i = n-2; i >= 0 && nums[i] >= nums[i+1]; i--) {
        }

        if (i >= 0){
            int j;
            for (j = n-1; j >= i+1 && nums[j] <= nums[i]; j--) {
            }
            swap(nums, i, j);
        }
        // reverse(nums, i+1, n-1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// 未通过
