package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指Offer 32：
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class MyLevelOrder {
    int[] res = new int[1200];
    int index =0;
    public int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode cur = queue.poll();
                if (cur != null){
                    res[index++] = cur.val;
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
            }
        }
        return Arrays.copyOf(res, index);
    }
}
