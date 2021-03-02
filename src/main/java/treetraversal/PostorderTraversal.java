package treetraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Leetcode 145:
 * 二叉树后序遍历
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode lastRight = null;

        while (!(stack.empty() && p == null)) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.peek();
                if (p.right == null || p.right == lastRight) {
                    list.add(p.val);
                    stack.pop();
                    lastRight = p;
                    p = null;
                } else {
                    p = p.right;
                }
            }
        }
        return list;
    }
}
