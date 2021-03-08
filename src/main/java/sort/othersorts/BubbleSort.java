package sort.othersorts;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
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
}
