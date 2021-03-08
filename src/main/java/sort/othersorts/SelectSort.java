package sort.othersorts;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 1, 2, 7, 6};

        int index = 0;

        while (index < array.length - 1) {
            int min = index;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }

            // 与index交换
            int swap = array[min];
            array[min] = array[index];
            array[index++] = swap;
        }

        System.out.println(Arrays.toString(array));
    }
}
