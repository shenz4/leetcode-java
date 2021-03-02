package linkedlist;

/**
 * Leetcode 24:
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode newhead = head.next;
        ListNode last = null;
        while (p != null) {

            if (p.next == null) {
                break;
            }

            ListNode q = p.next;

            // 交换
            p.next = q.next;
            q.next = p;
            if (last != null) {
                last.next = q;
            }

            last = p;
            p = p.next;
        }
        return newhead;
    }
}
