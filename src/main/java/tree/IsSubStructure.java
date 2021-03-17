package tree;

/**
 * 剑指Offer 26：
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 */
public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null){
            return false;
        }

        if (isEqual(A, B)){
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isEqual(TreeNode a, TreeNode b) {
        if (b == null){
            return true;
        }

        if (a == null && b != null){
            return false;
        }

        return a.val == b.val && isEqual(a.left, b.left) && isEqual(a.right, b.right);
    }
}
