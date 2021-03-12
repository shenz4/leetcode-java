package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 46:
 * 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class Permute {

    List<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> selected = new LinkedList<Integer>();
        backtrace(nums, selected);
        return res;
    }

    private void backtrace(int[] nums, LinkedList<Integer> selected) {

        if (selected.size() == nums.length){
            LinkedList<Integer> list = new LinkedList<Integer>(selected);
            res.add(list);
        }

        for (int i = 0; i < nums.length; i++) {
            if (selected.contains(nums[i])){
                continue;
            }

            selected.add(nums[i]);
            backtrace(nums, selected);
            selected.removeLast();
        }
    }
}
