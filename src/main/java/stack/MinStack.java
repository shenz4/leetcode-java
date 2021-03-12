package stack;

import java.util.Stack;

/**
 * Leetcode 155:
 * 用栈实现队列
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 */
class MinStack {
    Stack<Node> stack = new Stack();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        if (x < min){
            min = x;
        }
        Node node = new Node(x, min);
        stack.push(node);
    }

    public void pop() {
        stack.pop();

        if (stack.empty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = stack.peek().min;
        }
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    private static class Node {
        int val;
        int min;

        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}
