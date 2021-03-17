package offer;

/**
 * Offer 10-1:
 */
public class Fib {
    public int fib(int n) {
        if (n < 2){
            return n;
        }

        int[] dp = new int[n+1];
        // base case
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n] % 1000000007;
    }
}
