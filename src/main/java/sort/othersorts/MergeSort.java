package sort.othersorts;

import java.io.IOException;
import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) throws IOException {
        int[] array = new int[]{5, 3, 4, 1, 2, 7, 6, 4, 0};

        // 左闭右开
        mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] a, int start, int end) {
        int n = end - start;
        if (n < 2) {
            return;
        }
        // 为什么这样取中点，很重要
        int mid = (end + start) / 2;
        mergeSort(a, start, mid);
        mergeSort(a, mid, end);
        merge(a, start, mid, end);
    }

    // 合并
    private static void merge(int[] a, int start, int mid, int end) {
        int[] help = new int[end - start];
        int leftIndex = start;
        int rightIndex = mid;
        int n = 0;

        // 临界条件
        while (leftIndex < mid && rightIndex < end) {

            if (a[leftIndex] < a[rightIndex]) {
                help[n++] = a[leftIndex++];
            } else {
                help[n++] = a[rightIndex++];
            }
        }

        // 如果左边的剩余，则需要将其移动到尾巴后面，如右边剩余则不管
        if (rightIndex == end) {
            int postIndex = end - 1;
            while (leftIndex < mid) {
                a[postIndex--] = a[leftIndex++];
            }
        }
        // 然后处理辅助数组中的
        System.arraycopy(help, 0, a, start, n);
    }

}
