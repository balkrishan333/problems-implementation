package leetcode;

public class _1143_LongestCommonSubsequence {

    public static void main(String[] args) {
        _1143_LongestCommonSubsequence obj = new _1143_LongestCommonSubsequence();

        String text1 = "abcde", text2 = "ace";
        System.out.println(obj.longestCommonSubsequence(text1, text2));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
