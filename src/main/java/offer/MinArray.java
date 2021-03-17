package offer;

import java.util.Arrays;

/**
 * Offer 11:
 */
public class MinArray {

    // 难点：去重，边界条件的判断
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            if (numbers[i] < numbers[preIndex(i, n)]) {
                return Math.min(numbers[i], Arrays.stream(numbers).min().getAsInt());
            }
        }
        return numbers[0];
    }

    private int preIndex(int i, int len) {
        return i == 0 ? len - 1 : i - 1;
    }
}
