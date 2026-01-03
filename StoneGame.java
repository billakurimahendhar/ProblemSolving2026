class Solution {
    public int stoneGameII(int[] p) {
        int n = p.length;
        int[] suf = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suf[i] = suf[i + 1] + p[i];
        }

        return dfs(0, 1, suf, new int[n][n + 1]);
    }

    private int dfs(int i, int m, int[] suf, int[][] dp) {
        int n = suf.length - 1;

        if (i >= n) return 0;
        if (i + 2 * m >= n) return suf[i];
        if (dp[i][m] != 0) return dp[i][m];

        int best = 0;

        for (int x = 1; x <= 2 * m; x++) {
            best = Math.max(
                best,
                suf[i] - dfs(i + x, Math.max(m, x), suf, dp)
            );
        }

        return dp[i][m] = best;
    }
}
