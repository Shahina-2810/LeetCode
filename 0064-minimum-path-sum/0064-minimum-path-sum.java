class Solution {
    public int minPathSum(int[][] grid) {
       if (grid == null || grid.length == 0) return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        
        // Initialize the top-left cell
        dp[0][0] = grid[0][0];
        
        // Initialize the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        
        // Initialize the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        // Fill in the rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        
        return dp[m-1][n-1]; 
    }
}