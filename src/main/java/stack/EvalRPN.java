package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Leetcode 150:
 * 后缀表达式求值
 * 根据 逆波兰表示法，求表达式的值。
 * <p>
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * <p>
 * 说明：
 * <p>
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String t : tokens) {
            switch (t){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int num = stack.pop();
                    stack.push(stack.pop() - num);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int num2 = stack.pop();
                    stack.push(stack.pop() / num2);
                    break;
                default:
                    stack.push(Integer.valueOf(t));
            }
        }
        return stack.pop();
    }
}
// 自己写的不简洁，网上抄了一份
