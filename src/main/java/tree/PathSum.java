package tree;

import tree.TreeNode;

/**
 * Leetcode 112:
 * 路径总和
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class PathSum {
    boolean res = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        preOrder(root, targetSum);
        return res;
    }

    private void preOrder(TreeNode node, int remainder) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (remainder == node.val) {
                res = true;
            }
        }

        preOrder(node.left, remainder - node.val);
        preOrder(node.right, remainder - node.val);
    }
}
