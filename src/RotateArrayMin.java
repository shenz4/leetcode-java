/**
 * 旋转数组中的最小值
 */

class RotateArrayMin {
    public int minArray(int[] numbers) {
        int size = numbers.length;

        if (numbers.length == 0){
            return 0;
        }

        if (numbers[size-1] > numbers[0] ){
            return numbers[0];
        }

        for (int i = 1; i < size; i++) {
            if (numbers[i] < numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}