package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 78:
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class Subsets {
    LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> selected = new LinkedList<Integer>();
        backTrace(nums, selected);
        return res;
    }

    private void backTrace(int[] nums, LinkedList<Integer> selected) {
        LinkedList<Integer> list = new LinkedList<Integer>(selected);
        res.add(list);

        for (int i = 0; i < nums.length; i++) {
            if (selected.contains(nums[i])){
                continue;
            }
            if (selected.size() != 0 && selected.getLast() > nums[i]){
                continue;
            }

            selected.add(nums[i]);
            backTrace(nums, selected);
            selected.removeLast();
        }
    }
}
