class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        return solve(m - 1, n - 1, dp, obstacleGrid);  
    }
    
    private int solve(int row, int col, int[][] dp, int[][] maze) {
        if (row >= 0 && col >= 0 && maze[row][col] == 1) {
            return 0;
        }
        
        if (row == 0 && col == 0) {
            return 1;
        }
        
        if (row < 0 || col < 0) {
            return 0;
        }
        
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        int up = solve(row - 1, col, dp, maze); 
        int left = left = solve(row, col - 1, dp, maze);
        
        return dp[row][col] = up + left;
    }

}