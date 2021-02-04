import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        new RotateArray().rotate(nums, 2);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    void reverse(int[] nums, int start, int end){
        for (int i = 0; i < (end - start + 1) / 2; i++) {
            int swap = nums[start+i];
            nums[start+i] = nums[end - i];
            nums[end - i] = swap;
        }
    }
}
