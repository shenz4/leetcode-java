import treetraversal.TreeNode;

/**
 * Leetcode 110:
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class BalanceBinTree {
    public boolean isBalanced(TreeNode root) {

        return getHeight(root) >= 0;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if (Math.abs(right - left) > 1 || left < 0 || right < 0) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
