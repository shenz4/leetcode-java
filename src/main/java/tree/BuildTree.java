package tree;

import java.util.Arrays;

/**
 * 剑指Offer 07：
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class BuildTree {
    public static void main(String[] args) {
        int[] preOrder = new int[]{3, 9, 20, 15, 7};
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        new BuildTree().buildTree(preOrder, inOrder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = preorder.length;
        if (n == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);

        int offset = 0;
        while (inorder[offset] != root.val) {
            offset++;
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + offset), Arrays.copyOf(inorder, offset));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + offset, n), Arrays.copyOfRange(inorder, offset + 1, n));
        return root;
    }
}
