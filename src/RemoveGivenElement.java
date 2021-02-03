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