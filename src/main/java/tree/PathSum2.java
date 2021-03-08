package tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 113:
 * 路径总和II
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class PathSum2 {
    ArrayList<List<Integer>> res = new ArrayList<>();

    public ArrayList<List<Integer>> pathSum(TreeNode root, int targetSum) {
        preOrder(root, targetSum, new ArrayList<>());
        return res;
    }

    private void preOrder(TreeNode node, int remainder, ArrayList<Integer> lastList) {
        if (node == null) {
            return;
        }

        ArrayList<Integer> list  = new ArrayList<>(lastList);
        list.add(node.val);

        if (node.left == null && node.right == null) {
            if (remainder == node.val) {
                res.add(list);
            }
        }

        preOrder(node.left, remainder - node.val, list);
        preOrder(node.right, remainder - node.val, list);
    }
}
