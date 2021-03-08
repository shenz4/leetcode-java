package tree;

import tree.TreeNode;

/**
 * Leetcode 111:
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明：叶子节点是指没有子节点的节点。
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getDepth(node.left);
        int right = getDepth(node.right);

        return (right > 0 && left > 0) ? Math.min(left, right) + 1 : 1 + left + right;
    }
}
