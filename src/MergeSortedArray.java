import java.util.Arrays;

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