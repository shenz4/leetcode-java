package offer;

/**
 * Offer 03:
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        boolean[] buffer = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (buffer[nums[i]] == true) {
                return nums[i];
            }
            buffer[nums[i]] = true;
        }
        return -1;
    }
}
