public class ShuffleArray {
    /**
     * Leetcode 1470:
     *
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     *
     * (不额外开辟空间的解法，原本是道简单题)
     */
    public int[] shuffle(int[] nums, int n) {

        if (n == 1) {
            return nums;
        }

        int insertPosition = 1;
        for (int i = n; i < 2 * n; i++) {
            int temp = nums[i];

            for (int j = i - 1; j >= insertPosition; j--) {
                nums[j + 1] = nums[j];
            }
            nums[insertPosition] = temp;
            insertPosition += 2;
        }
        return nums;
    }
}
