import tree.TreeNode;

import java.util.ArrayList;

/**
 * Leetcode 129:
 * 求根节点到叶节点数字之和
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * 每条从根节点到叶节点的路径都代表一个数字：
 *
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 *
 * 叶节点 是指没有子节点的节点。
 *
 */
public class SumNumbers {

    ArrayList<Integer> res = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        preOrder(root, 0);

        return res.stream().reduce((a, b) -> a + b).get();
    }

    private void preOrder(TreeNode node, int lastNum) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            int t = lastNum * 10 + node.val;
            res.add(t);
        }

        preOrder(node.left, lastNum * 10 + node.val);
        preOrder(node.right, lastNum * 10 + node.val);
    }
}
