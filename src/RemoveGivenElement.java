/**
 * Leetcode 27:
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */
public class RemoveGivenElement {

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        new RemoveGivenElement().removeElement(a, 2);
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if (nums[fast] == val){
                fast++;
            }else {
                nums[slow++] = nums[fast++];
            }
        }

        return slow;
    }

}