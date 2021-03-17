package offer;

/**
 * Offer 04:
 */
public class FindNumberIn2DArray {
    int target;
    private int[][] matrix;
    int m;
    int n;

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 边界检查，很重要
        if (matrix == null || matrix.length < 1){
            return false;
        }

        m = matrix.length;
        n = matrix[0].length;
        this.matrix = matrix;
        this.target = target;

        return find(0, n-1);
    }

    boolean find(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n){
            return false;
        }

        if (matrix[i][j] == target){
            return true;
        }

        if (matrix[i][j] < target){
            return find(++i, j);
        }else {
            return find(i, --j);
        }
    }
}
