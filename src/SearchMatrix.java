/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 */
public class SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        new SearchMatrix().searchMatrix(matrix, 20);
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length -1;
        int col = matrix[0].length -1;

        return isOK(row, col, matrix, target);
    }

    boolean isOK(int row, int col, int[][] matrix, int target){
        System.out.println(row + " " + col);

        if (isOut(row, col, matrix)){
            return false;
        }

        if (matrix[row][col] == target){
            return true;
        }else if (matrix[row][col] > target ){
            return isOK(--row, col, matrix, target);
        }else {
            return isOK(row, ++col, matrix, target);
        }
    }

    boolean isOut(int row, int col, int[][] matrix){
        return (row < 0) || (col > matrix[0].length-1);
    }
}