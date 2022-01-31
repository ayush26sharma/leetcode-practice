class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        for(int i = 0; i<m; i++){
            if (target<=matrix[i][n-1]){
                if (target==matrix[i][n-1]) return true;
                int k = Arrays.binarySearch(matrix[i],target);
                if (k<0) return false;
                else return true;
            }
        }
        return false;
    }
}