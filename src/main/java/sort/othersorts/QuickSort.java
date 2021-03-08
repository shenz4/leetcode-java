package sort.othersorts;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]) {

        int[] array = new int[]{5, 3, 4, 1, 2, 7, 6};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int array[], int low, int high) {

        // 出口
        if (low >= high){
            return;
        }

        int key = array[low];
        int leftIndex = low, rightIndex = high;

        while (leftIndex < rightIndex) {
            //哨兵j先左移，这样可以保证最后a[j]会小于key
            while (leftIndex < rightIndex && array[rightIndex] > key) {
                rightIndex--;
            }
            if (leftIndex == rightIndex) {
                break;
            }

            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            if (leftIndex != rightIndex){
                int swap = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = swap;
            }
        }
        array[low] = array[rightIndex];
        array[rightIndex] = key;

        quickSort(array, low, rightIndex-1);
        quickSort(array, rightIndex+1, high);
    }
}
