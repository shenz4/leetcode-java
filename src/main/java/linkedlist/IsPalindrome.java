package linkedlist;

import java.util.Stack;

/**
 * Leetcode 234:
 * 请判断一个链表是否为回文链表。
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // 统计链表长度
        ListNode p = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }

        ListNode fast = head;
        ListNode slow = head;
        Stack<ListNode> stack = new Stack<ListNode>();

        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            stack.push(slow);
            slow = slow.next;
        }
        // 如果是偶数
        if ((count & 1) == 1) {
            stack.pop();
            slow = slow.next;
        }
        while (slow != null) {
            if (!stack.empty() || slow.val != stack.pop().val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
// 没通过
