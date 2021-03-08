package linkedlist;

/**
 * 剑指Offer 52:
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class GetIntersectionNode {
    public static void main(String[] args) {
        ListNode a = null;
        ListNode b = null;
        System.out.println(a == b);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;

        int lengthA = 0, lengthB = 0;
        while (pa != null) {
            lengthA++;
            pa = pa.next;
        }

        while (pb != null) {
            lengthB++;
            pb = pb.next;
        }

        int cha = lengthA - lengthB;

        pa = headA;
        pb = headB;
        if (cha > 0) {
            while (cha > 0) {
                pa = pa.next;
                cha--;
            }
        } else {
            while (cha < 0) {
                pb = pb.next;
                cha++;
            }
        }

        while (true) {
            if (pa == pb) {
                return pa;
            }
            pa = pa.next;
            pb = pb.next;
        }
    }
}
