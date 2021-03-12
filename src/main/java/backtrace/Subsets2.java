package backtrace;

import java.util.*;

/**
 * Leetcode 90:
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 */
public class Subsets2 {
    LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        LinkedList<Integer> path = new LinkedList<Integer>();
        Arrays.sort(nums);

        backTrace(nums, 0, path);
        return res;
    }

    private void backTrace(int[] nums, int start, LinkedList<Integer> path) {
        // 终点
        LinkedList<Integer> list = new LinkedList<Integer>(path);
        res.add(list);

        for (int i = start; i < nums.length; i++) {
            // 减枝
            if (i != start && nums[i] == nums[i-1]){
                continue;
            }

            path.add(nums[i]); // 选择
            backTrace(nums, i+1, path); // 递归
            path.removeLast(); // 回溯
        }
    }
}
