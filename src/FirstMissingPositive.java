/**
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 *  
 *
 * 进阶：你可以实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案吗？
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] a = {3, 4, -1 ,1};
        int res = new FirstMissingPositive().firstMissingPositive(a);
        System.out.println(res);
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isLegal(i, nums)){

                if (i+1 !=nums[i]){
                    int swap = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = swap;

                    // 解决死循环
                    if (isLegal(i, nums) && nums[nums[i]-1] != nums[i]){
                        i--;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i+1 !=nums[i]){
                return i+1;
            }
        }
        return nums.length + 1;
    }

    private boolean isLegal(int i, int[] nums) {
        return nums[i] > 0 && nums[i] <= nums.length;
    }
}
