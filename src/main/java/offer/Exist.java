package offer;

/**
 * Offer 12:
 */
public class Exist {
    char[] words;
    char[][] boards;
    int m, n;

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }

        this.boards = board;
        this.words = word.toCharArray();
        this.m = board.length;
        this.n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index) {
        // dfs终止
        if (index >= words.length || i < 0 || i >= m || j < 0 || j >= n || boards[i][j] != words[index]) {
            return false;
        }

        // 更新结果
        if (index == words.length-1) {
            return true;
        }

        char tmp = boards[i][j];
        boards[i][j] = '-';
        boolean res =
                dfs(i - 1, j, index + 1)
                        || dfs(i + 1, j, index + 1)
                        || dfs(i, j - 1, index + 1)
                        || dfs(i, j + 1, index + 1);
        boards[i][j] = tmp;

        return res;
    }
}
// 未通过