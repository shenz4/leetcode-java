package backtrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 77:
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
public class Combine {
    LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
    int layer;
    int bound;
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> path = new LinkedList<Integer>();
        bound = n;
        layer = k;

        backTrace(1, path);
        return res;
    }

    private void backTrace(int index, LinkedList<Integer> path) {
        // 结束条件
        if (path.size() == layer){
            res.add(new LinkedList<Integer>(path));
        }
        for (int i = index; i <= bound; i++) {
            // 不用减枝
            path.add(i);
            backTrace(i+1, path);
            path.removeLast();
        }
    }
}
