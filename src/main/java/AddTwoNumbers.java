import tree.TreeNode;

/**
 * Leetcode 2:
 * 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode p = null;
        int up = 0;

        while (l1 != null || l2 != null) {

            int tmp = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + up;
            up = tmp / 10;
            tmp = tmp % 10;

            if (head == null) {
                head = new ListNode(tmp);
                p = head;
            } else {
                p.next = new ListNode(tmp);
                p = p.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (up == 1) {
            p.next = new ListNode(1);
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}