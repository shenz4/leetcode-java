package backtrace;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 47:
 * 全排列II
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class PermuteUnique {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    int[] nums;
    int n;

    boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        this.visited = new boolean[n];

        Arrays.sort(nums);
        backTrace();
        return res;
    }

    private void backTrace() {
        if (path.size() > n) {
            return;
        }

        if (path.size() == n) {
            res.add(new LinkedList<>(path));
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }

            // 神奇的减枝,防止误伤[1,2,二,4]这样的情况
            if (i != 0 && nums[i] == nums[i - 1] && visited[i-1] == false) {
                continue;
            }

            path.add(nums[i]);
            visited[i] = true;
            backTrace();
            path.removeLast();
            visited[i] = false;
        }
    }
}
