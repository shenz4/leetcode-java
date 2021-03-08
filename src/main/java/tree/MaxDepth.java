package tree;

import tree.TreeNode;

/**
 * Leetcode 104:
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }

    private int getMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(getMaxDepth(node.left), getMaxDepth(node.right)) + 1;
    }
}
