import java.util.Arrays;

/**
 * Leetcode 88:
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;

        int mp = m - 1;
        int np = n - 1;

        while (mp >= 0 && np >= 0) {

            if (nums1[mp] > nums2[np]){
                nums1[index--] = nums1[mp--];
            }else if(nums1[mp] <= nums2[np]){
                nums1[index--] = nums2[np--];
            }
        }

        if (mp < 0){
            for (int i = np; i >=0 ; i--) {
                nums1[index--] = nums2[i];
            }
        }
    }
}