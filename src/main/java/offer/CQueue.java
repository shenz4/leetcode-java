package offer;

import java.util.Stack;

/**
 * Offer 09:
 */
public class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.empty()){
            return s2.pop();
        }

        while (!s1.empty()){
            s2.push(s1.pop());
        }
        if (s2.empty()){
            return -1;
        }
        return s2.pop();
    }
}
