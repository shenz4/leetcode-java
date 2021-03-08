package linkedlist;

import linkedlist.ListNode;

import java.util.List;

/**
 * Leetcode 876:
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        if (head.next == null){
            return head;
        }

        ListNode p = head;
        ListNode res = head;

        while (p != null){
            p = p.next;
            if ( p == null){
                break;
            }
            p = p.next;
            res = res.next;
        }

        return res;
    }
}
