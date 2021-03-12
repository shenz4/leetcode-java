package dfs;


/**
 * Leetcode 130:
 * 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 */
public class Solve {
    char[][] board;
    int m;
    int n;

    public void solve(char[][] board) {
        this.board = board;
        this.m = board.length;
        this.n = board[0].length;

        // 上下边界
        for (int i = 0; i < n; i++) {
            dfs(0, i);
            dfs(m - 1, i);
        }

        // 左右边界
        for (int i = 0; i < m; i++) {
            dfs(i, 0);
            dfs(i, n - 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= m) {
            return;
        }
        if (j < 0 || j >= n) {
            return;
        }
        if (board[i][j] != 'O') {
            return;
        }

        board[i][j] = '1';
        dfs(i - 1, j);
        dfs(i, j - 1);
        dfs(i + 1, j);
        dfs(i, j + 1);
    }
}
