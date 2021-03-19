package backtrace;

import java.util.LinkedList;

/**
 * Leetcode 60:
 * 给出集合 [1,2,3,...,n]，其所有元素共有 n! 种排列。
 * <p>
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 */
public class GetPermutation {
    String res = "";
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] visited;
    int n;
    int k;

    int count = 0;
    boolean isStop = false;

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        this.visited = new boolean[n+1];

        backTrace();
        return res;
    }

    private void backTrace() {
        if (isStop) {
            return;
        }

        if (path.size() > n) {
            return;
        }

        if (path.size() == n) {
            count++;
            if (count == k) {
                StringBuilder builder = new StringBuilder();
                for (Integer integer : path) {
                    builder.append(integer);
                }
                res = builder.toString();
                isStop = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i] == true) {
                continue;
            }

            path.add(i);
            visited[i] = true;
            backTrace();
            path.removeLast();
            visited[i] = false;
        }
    }
}
