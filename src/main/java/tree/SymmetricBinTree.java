package tree;

/**
 * Leetcode 101:
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class SymmetricBinTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }

        return cmp(root.left, root.right);
    }

    private boolean cmp(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }

        if (left == null || right == null || left.val != right.val){
            return false;
        }

        return cmp(left.left, right.right) && cmp(left.right, right.left);
    }
}
