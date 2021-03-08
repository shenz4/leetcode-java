package linkedlist;

/**
 * Leetcode 92:
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 */
public class ReverseBetween {
    ListNode successor;

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == 1){
            return reverseN(head, right);
        }

        head.next = reverseBetween(head.next, left-1, right-1);
        return head;
    }

    private ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }

        ListNode newHead = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return newHead;
    }
}
