package tree;

/**
 * 剑指Offer 55:
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) == -1 ? false : true;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if (left == -1 || right == -1 || Math.abs(right - left) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
