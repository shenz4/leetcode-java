/**
 * Leetcode 283:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 1){
            return;
        }

        int slow = 0;
        for (int num : nums) {
            if (num != 0){
                nums[slow++] = num;
            }
        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
