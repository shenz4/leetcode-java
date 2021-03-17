package offer;

import java.util.Arrays;

public class ReversePrint {
    int[] res = new int[20000];
    int index = 0;

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        addTo(head);
        return Arrays.copyOf(res, index);
    }

    private void addTo(ListNode head) {
        if (head == null){
            return;
        }
        addTo(head.next);
        res[index++] = head.val;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
