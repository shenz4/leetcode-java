import java.util.Arrays;

/**
 * Leetcode 80:
 * 给定一个增序排列数组 nums ，你需要在 原地 删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class RemoveTwoDuplicateElement {

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,2,2,3};
        int len = new RemoveTwoDuplicateElement().removeDuplicates(a);
        a = Arrays.copyOf(a, len);
        System.out.println(Arrays.toString(a));
    }

    public int removeDuplicates(int[] nums) {

        if (nums==null || nums.length==0){
            return 0;
        }

        int before = nums[0] + 1;
        int slow = 0, fast = 0;
        int twice = 0;

        while (fast < nums.length){
            if (nums[fast] == before){
                if (twice < 2){
                    nums[slow++] = nums[fast];
                }
                twice++;
                fast++;
            }else {
                before = nums[fast];
                nums[slow++] = nums[fast++];
                twice = 1;
            }
        }
        return slow;
    }
}