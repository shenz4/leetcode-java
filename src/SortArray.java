import java.util.Arrays;

/**
 * Leetcode 912:
 * 排序数组
 * 先实现了一个（带优化的）冒泡排序，但实际上应该用 log(n) 时间复杂度的算法才能通过
 *
 * 然后实现了一个堆排序
 */
public class SortArray {

    public static void main(String[] args) {
        int[] input = new int[]{5, 1, 1, 2, 0, 0};
        new SortArray().sortArray(input);
    }

    public int[] bubbleSortArray(int[] nums) {
        int n = nums.length;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        buildBigHeap(nums);

        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustHeap(nums, 0, i);
        }
        return nums;
    }

    private void swap(int[] nums, int a, int b) {
        int swap = nums[a];
        nums[a] = nums[b];
        nums[b] = swap;
    }

    private void buildBigHeap(int[] nums) {
        for (int i = (nums.length - 1) / 2; i >= 0 ; i--) {
            adjustHeap(nums, i, nums.length);
        }
    }

    private void adjustHeap(int[] nums, int index, int size) {

        // 递归出口
        if (index > (size - 2) / 2) {
            return;
        }

        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int largest = index;
        if (left < size && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < size && nums[right] > nums[largest]) {
            largest = right;
        }

        if (index != largest) {
            swap(nums, largest, index);

            adjustHeap(nums, largest, size);
        }
    }
}