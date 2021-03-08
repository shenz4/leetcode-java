package tree;

public class TreeBuilder {
    TreeNode getTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        root.left = left;
        root.right = right;

        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);
        return root;
    }

    TreeNode getNullTree() {
        return null;
    }

    TreeNode getOneNodeTree() {
        return new TreeNode(1);
    }
}
