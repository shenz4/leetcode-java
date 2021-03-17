package offer;

import java.util.Arrays;

/**
 * Offer 07:
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int index;
        for (index = 0; index < inorder.length && inorder[index] != preorder[0]; index++) {
        }

        root.left = buildTree(Arrays.copyOfRange(preorder,1, 1 + index), Arrays.copyOf(inorder, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1+index, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
