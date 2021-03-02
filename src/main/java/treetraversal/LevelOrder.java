package treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Leetcode 429:
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 * <p>
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        LinkedList<Node> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list1 = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                // 没检查cur是否为空，因为已经保证了它offer时必不为空
                list1.add(cur.val);
                for (Node child : cur.children) {
                    if (child!=null){
                        queue.offer(child);
                    }
                }
            }
            res.add(list1);
        }
        return res;
    }
}
