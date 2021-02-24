package treetraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Leetcode 144:
 * 二叉树先序遍历
 */
public class PreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode p;
            if ((p = stack.pop()) == null) {
                continue;
            }

            list.add(p.val);
            stack.push(p.right);
            stack.push(p.left);
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeBuilder().getTree();
        List<Integer> res = preorderTraversal(root);
        System.out.println(res);
    }
}