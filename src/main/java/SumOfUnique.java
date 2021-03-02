/**
 * Leetcode 1748:
 * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 *
 * 请你返回 nums 中唯一元素的 和 。
 */
public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}
