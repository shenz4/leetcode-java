package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode 102:
 * 二叉树层次遍历
 */
public class BFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode p;
        if (root == null) {
            return new ArrayList<>();
        }

        queue.offer(root);
        while (!queue.isEmpty()) {

            int count = queue.size();
            ArrayList<Integer> list1 = new ArrayList<>();

            while (count > 0) {
                p = queue.poll();
                list1.add(p.val);
                if (p.left != null){
                    queue.offer(p.left);
                }
                if (p.right != null){
                    queue.offer(p.right);
                }
                count--;
            }
            list.add(list1);
        }
        return list;
    }
}
