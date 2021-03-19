package offer;

/**
 * Offer 13:
 */
public class MovingCount {
    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];

        dfs(0, 0);

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == true){
                    res++;
                }
            }
        }

        return res;
    }

    private void dfs(int i, int j) {
        // 结束dfs
        if (i < 0 || i >= m || j < 0 || j >= n || bitSum(i) + bitSum(j) > k || visited[i][j] == true){
            return;
        }

        // 记录
        visited[i][j] = true;

        dfs(i-1, j);
        dfs(i+1, j);
        dfs(i, j-1);
        dfs(i, j+1);
    }

    private int bitSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }

        return sum;
    }
}
