package tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 257:
 * 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 */
public class TreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        preOrder(root, "", res);
        return res;
    }


    private void preOrder(TreeNode root, String str, ArrayList<String> res) {
        if (root ==null){
            return;
        }

        if (root.left == null && root.right == null) {
            res.add(str + root.val);
        }

        preOrder(root.left, str + root.val + "->", res);
        preOrder(root.right, str + root.val + "->", res);
    }
}
