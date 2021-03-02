import java.util.Arrays;

/**
 * Leetcode 189:
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        new RotateArray().rotate(nums, 2);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    void reverse(int[] nums, int start, int end){
        for (int i = 0; i < (end - start + 1) / 2; i++) {
            int swap = nums[start+i];
            nums[start+i] = nums[end - i];
            nums[end - i] = swap;
        }
    }
}
