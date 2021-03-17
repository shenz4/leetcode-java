package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
 * 从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
public class MyPathSum {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        backTrace(root, target);
        return res;
    }

    private void backTrace(TreeNode node, int red) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        if (red == node.val && node.left == null && node.right == null){
            res.add(new LinkedList<>(path));
        }else {
            backTrace(node.left, red - node.val);
            backTrace(node.right, red - node.val);
        }
        path.removeLast();
    }
}
