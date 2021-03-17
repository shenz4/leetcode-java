import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 15:
 * 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int[] nums;
    int n;

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        this.nums = nums;
        this.n = nums.length;

        backTrace(0, 0);
        return res;
    }

    private void backTrace(int start, int sum) {
        // 结束条件，没有则不设
        if (path.size() > 3 || sum > 0) {
            return;
        }

        // 更新结果
        if (path.size() == 3 && sum == 0) {
            res.add(new LinkedList<>(path));
        }

        for (int i = start; i < n; i++) {
            // 去重（减枝）
            if (i != start && nums[i] == nums[i-1]){
                continue;
            }

            path.add(nums[i]);
            backTrace(i+1, sum + nums[i]);
            path.removeLast();
        }
    }
}
