package Math;

/**
 * Leetcode 7:
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class IntegerReverse {
    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(new IntegerReverse().reverse(input));
    }

    public int reverse(int x) {
        // 对负数取余，在不同平台上计算结果有差异，总感觉这里有点问题

        int res = 0;
        while (x != 0) {
            int remainder = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE/10 && remainder > Integer.MAX_VALUE % 10)) {
                return 0;
            }

            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MAX_VALUE/10 && remainder < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            res = res * 10 + remainder;
            x = x / 10;
        }
        return res;
    }
}
