package dp;

/**
 * Leetcode 5:
 * 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2){
            return s;
        }

        int maxLength = 1;
        String res = s.substring(0, 1);

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        // base case
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)){
                    dp[i][j] = false;
                }else {
                    if ((j-1) - (i+1) + 1 < 2){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                if (dp[i][j] == true && j-i+1 > maxLength){
                    maxLength = j-i+1;
                    res = s.substring(i, j+1);
                }
            }
        }
        return res;
    }
}
