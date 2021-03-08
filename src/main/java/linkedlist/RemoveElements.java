package linkedlist;

/**
 * Leetcode 203:
 * 删除链表中等于给定值 val 的所有节点。
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        if (head.val == val){
            return removeElements(head.next, val);
        }else {
            head.next = removeElements(head.next, val);
            return head;
        }
    }
}
