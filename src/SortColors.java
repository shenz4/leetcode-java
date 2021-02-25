/**
 * Leetcode 75:
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 */
public class SortColors {
    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(a);
    }

    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1;
        int index = 0;
        while (index <= high) {
            if (nums[index] == 0) {
                swap(nums, index, low++);
                index++;
            } else if (nums[index] == 2) {
                swap(nums, index, high--);
            } else if (nums[index] == 1) {
                index++;
            }
        }
    }

    private void swap(int[] ints, int a, int b) {
        int swap = ints[a];
        ints[a] = ints[b];
        ints[b] = swap;
    }
}
