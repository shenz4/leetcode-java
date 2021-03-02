import java.util.Arrays;

/**
 * Leetcode 63:
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 */
public class UniquePathsII {
    public static void main(String[] args) {
        int[][] a = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        new UniquePathsII().uniquePathsWithObstacles(a);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        // Init
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    if (obstacleGrid[i][j] == 1){
                        dp[i][j] = 0;
                    }else {
                        dp[i][j] = 1;
                    }
                    continue;
                }

                int left, up;
                try {
                    left = dp[i][j - 1];
                } catch (IndexOutOfBoundsException e) {
                    left = 0;
                }

                try {
                    up = dp[i - 1][j];
                } catch (IndexOutOfBoundsException e) {
                    up = 0;
                }

                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : left + up;
            }
        }
        return dp[m - 1][n - 1];
    }
}
