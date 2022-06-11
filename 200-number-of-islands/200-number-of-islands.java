class Solution {
    int count = 0;
    public void helper(char[][]grid, int i, int j, boolean[][] visited){
        int row = grid.length;
        int col = grid[0].length;
        
        if(i<0 || j<0 || i==row || j== col || grid[i][j]=='0' || visited[i][j]==true) return;
        
        visited[i][j]=true;
        count++;
        
        helper(grid, i+1, j, visited);
        helper(grid, i-1, j, visited);
        helper(grid, i, j+1, visited);
        helper(grid, i, j-1, visited);
        
    }
    
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int res = 0;
        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                count = 0;
                helper(grid, i, j, visited);
                if(count!=0) res++;
            }
        }
        return res;
    }
}