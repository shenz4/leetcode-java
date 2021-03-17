package tree;

import org.omg.CORBA.TRANSACTION_MODE;

/**
 * Leetcode 235:
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * <p>
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * <p>
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 */
public class LowestCommonAncestor {
    boolean first, second;
    TreeNode p, q;
    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < q.val) {
            this.p = p;
            this.q = q;
        } else {
            this.p = q;
            this.q = p;
        }

        travel(root);
        return result;
    }

    void travel(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.val > p.val && node.val > q.val) {
            travel(node.left);
            return;
        }

        if (node.val < p.val && node.val < q.val) {
            travel(node.right);
            return;
        }

        // if (node.val >p.val && node.val < q.val)
        result = node;
        return;
    }
}
