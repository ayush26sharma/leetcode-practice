class Solution {
    public void helper(int [][]image, int i, int j, int prev, int newColor){
        int m = image.length; int n = image[0].length;
        if(i<0 || j<0 || i>=m || j>=n || prev!= image[i][j] || newColor==image[i][j]) return;
        if(image[i][j]==prev){
            image[i][j]=newColor;
            helper(image, i+1, j, prev, newColor);
            helper(image, i, j+1, prev, newColor);
            helper(image, i-1, j, prev, newColor);
            helper(image, i, j-1, prev, newColor);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length; int n = image[0].length;
        int prev = image[sr][sc];
        helper(image,sr,sc,prev,newColor);
        return image;
    }
}
