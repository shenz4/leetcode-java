import java.util.Arrays;

/**
 * Leetcode 88:
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new MergeSortedArray().merge(nums1,3,nums2,3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int p1 = 0, p2 = 0;

        int i;
        for (i = 0; (p1 != m && p2 != n); i++) {

            if (nums1[p1] < nums2[p2]){
                res[i] = nums1[p1];
                p1++;
            }else {
                res[i] = nums2[p2];
                p2++;
            }
        }

        if (p1 == m){
            System.arraycopy(nums2, p2, res, i, (n-p2));
        }else if (p2 == n){
            System.arraycopy(nums1, p1, res, i, (m-p1));
        }

        System.arraycopy(res, 0, nums1, 0, m+n);
        System.out.println(Arrays.toString(nums1));
    }
}