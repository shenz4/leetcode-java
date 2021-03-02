package linkedlist;

/**
 * Leetcode 328
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        int count = 1;

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next, evenHead=head.next;
        ListNode p = even.next;
        while (p != null) {

            if ((count & 1) == 1) {
                odd.next = p;
                odd = p;
            } else {
                even.next = p;
                even = p;
            }

            p = p.next;
            count++;
            System.out.println(odd.val + " " + even.val);
        }

        if((count & 1) == 0){
            even.next = null;
        }

        odd.next = evenHead;
        return head;
    }
}
