import tree.TreeNode;

import java.util.ArrayList;

public class SumNumbers {

    ArrayList<Integer> res = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        preOrder(root, 0);

        return res.stream().reduce((a, b) -> a + b).get();
    }

    private void preOrder(TreeNode node, int lastNum) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            int t = lastNum * 10 + node.val;
            res.add(t);
        }

        preOrder(node.left, lastNum * 10 + node.val);
        preOrder(node.right, lastNum * 10 + node.val);
    }
}
