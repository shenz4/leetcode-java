package backtrace;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 40:
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 *
 */
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] input = new int[]{14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        List<List<Integer>> output = new CombinationSum2().combinationSum2(input, 27);
    }

    List<List<Integer>> res = new LinkedList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        LinkedList<Integer> path = new LinkedList<>();

        backTrace(path, 0, 0);
        return res;

    }

    private void backTrace(LinkedList<Integer> path, int start, int sum) {
        if (sum == target){
            res.add(new LinkedList<>(path));
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target){
                continue;
            }
            if (i != start && candidates[i] == candidates[i-1]){
                continue;
            }

            path.add(candidates[i]);
            System.out.println(path.toString());
            backTrace(path, i +1, sum+candidates[i]);
            path.removeLast();
        }
    }
}
