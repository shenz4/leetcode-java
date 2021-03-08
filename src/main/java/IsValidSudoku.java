/**
 * Leetcode 36:
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] squares = new boolean[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0';
                int curSquare = i / 3 * 3 + j / 3;
                if (rows[i][num] == true || cols[j][num] == true || squares[curSquare][num] == true) {
                    return false;
                } else {
                    rows[i][num] = true;
                    cols[j][num] = true;
                    squares[curSquare][num] = true;
                }
            }
        }
        return true;
    }
}
