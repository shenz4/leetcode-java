package linkedlist;

import java.util.Arrays;

/**
 * 剑指Offer 06：
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {
    int[] res = new int[10000];
    int index = 0;

    public int[] reversePrint(ListNode head) {
        reverse(head);
        return Arrays.copyOf(res, index);
    }

    private void reverse(ListNode head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        res[index++] = head.val;
    }
}
