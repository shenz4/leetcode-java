import java.util.Arrays;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean isOver = true;
        for (int i = n-1; i >=0 ; i--) {
            int next = digits[i] + 1;
            if (next != 10){
                digits[i] = next;
                isOver = false;
                break;
            }else {
                digits[i] = 0;
            }
        }
        if (isOver){
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
