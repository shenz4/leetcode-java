package offer;

/**
 * Offer 10-2:
 */
public class NumWays {
    public int numWays(int n) {
        if (n < 2){
            return 1;
        }

        int[] dp = new int[n+1];
        // base case
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}
