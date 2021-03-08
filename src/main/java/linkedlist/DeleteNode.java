package linkedlist;

/**
 * Leetcode 237:
 * 删除链表中的结点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode tmp = node.next;
        node.next = node.next.next;
        tmp.next = null;
    }
}
