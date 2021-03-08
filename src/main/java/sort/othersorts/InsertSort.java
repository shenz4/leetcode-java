package sort.othersorts;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 1, 2, 7, 6, 9, 8};

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > temp){
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
