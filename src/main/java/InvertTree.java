import treetraversal.TreeNode;

/**
 * Leetcode 226:
 * 翻转一棵二叉树。
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if (node == null){
            return;
        }

        invert(node.left);
        invert(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
