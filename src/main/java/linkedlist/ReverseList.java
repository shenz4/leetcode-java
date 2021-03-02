package linkedlist;

/**
 * Leetcode 206:
 * 反转链表
 */
public class ReverseList {
    // 迭代实现
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode pre = null, p = head;
        while (p != null){
            ListNode tmp = p.next;
            p.next = pre;
            // 移动
            pre = p;
            p = tmp;
        }
        return pre;
    }

    // 递归实现
    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode last = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}
