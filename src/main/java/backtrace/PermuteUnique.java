package backtrace;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 47:
 */
public class PermuteUnique {
    List<List<Integer>> res = new LinkedList<>();
    int[] nums;


    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        LinkedList<Integer> path = new LinkedList<>();

        backTrace(path);
        return res;
    }

    private void backTrace(LinkedList<Integer> path) {
        if (path.size() == nums.length){
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] ==nums[i-1]){
                continue;
            }

            path.add(nums[i]);
            backTrace(path);
            path.removeLast();
        }
    }
}
// 未通过
