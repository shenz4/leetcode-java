package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 216:
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 */
public class CombinationSum3 {
    List<List<Integer>> res = new LinkedList<>();
    int n;
    int k;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        LinkedList<Integer> path = new LinkedList<>();

        backTrace(path, 1, 0);
        return res;
    }

    private void backTrace(LinkedList<Integer> path, int start, int sum){
        if (path.size() == k && sum == n){
            res.add(new LinkedList<>(path));
        }

        for (int i = start; i <= 9; i++) {
            // 减枝
            if (path.size() > k || sum + i > n){
                continue;
            }

            path.add(i);
            backTrace(path, i+1, sum+i);
            path.removeLast();
        }
    }
}
