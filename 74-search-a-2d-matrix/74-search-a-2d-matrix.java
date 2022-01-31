class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            if (target<=matrix[i][matrix[0].length-1]){
                if (target==matrix[i][matrix[0].length-1]) return true;
                if (Arrays.binarySearch(matrix[i],target)<0) return false;
                else return true;
            }
        }
        return false;
    }
}