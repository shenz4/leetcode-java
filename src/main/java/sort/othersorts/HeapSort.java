package sort.othersorts;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 1, 2, 0, 0};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] array, int a, int b) {
        int swap = array[a];
        array[a] = array[b];
        array[b] = swap;
    }

    static void adjustHeap(int[] array, int index, int size) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int nonLeaf = size / 2 - 1;

        // recursion exit
        if (index > nonLeaf) {
            return;
        }

        int largest = index;

        if (left < size && array[left] >= array[largest]) {
            largest = left;
        }

        if (right < size && array[right] >= array[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(array, largest, index);
            adjustHeap(array, largest, size);
        }
        System.out.println(Arrays.toString(array));
    }

    static void buildBigHeap(int[] array) {
        int nonLeaf = (array.length) / 2 - 1;
        for (int i = nonLeaf; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
    }

    static void heapSort(int[] array) {
        buildBigHeap(array);
        for (int i = array.length-1; i >= 1; i--) {
            swap(array, 0, i);
            adjustHeap(array, 0, i-1);
        }
    }
}
