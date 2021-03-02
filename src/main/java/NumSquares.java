import java.util.Arrays;

/**
 * Leetcode 279:
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
 */
public class NumSquares {
    public static void main(String[] args) {
        new NumSquares().numSquares(13);
    }

    public int numSquares(int n) {
        int[] dp = new int[n+1];

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 1; j <= (int) Math.sqrt(n + 1); j++) {

                int next;
                if ((next = i - j * j) >= 0 && dp[next] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[next]);
                }
            }
        }
        return dp[n];
    }
}
