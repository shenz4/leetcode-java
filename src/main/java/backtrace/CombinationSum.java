package backtrace;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.*;

/**
 * Leetcode 39:
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 */
public class CombinationSum {
    LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> path = new LinkedList<Integer>();
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;

        backTrace(path, 0);
        return res;
    }

    private void backTrace(LinkedList<Integer> path, int start) {
        if ( pathSum(path) == target){
            res.add(new LinkedList<>(path));
        }

        for (int i = start; i < candidates.length; i++) {
            // 减枝
            if (pathSum(path) + candidates[i] > target){
                continue;
            }

            path.add(candidates[i]);
            backTrace(path, i);
            path.removeLast();
        }
    }

    private int pathSum(LinkedList<Integer> path){
        Iterator<Integer> it = path.iterator();
        int sum = 0;
        while (it.hasNext()){
            sum += it.next();
        }
        return sum;
    }
}
