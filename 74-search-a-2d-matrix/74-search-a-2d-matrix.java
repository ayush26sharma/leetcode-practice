class Solution {
    public int searchRow(int [][] matrix, int target){
        int low = 0;
        int high = matrix.length-1;
        int k = matrix[0].length-1;
        if (target < matrix[0][k]) return 0;
        if (matrix.length==1) return 0;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (matrix[mid][k]>=target){
                if (mid==0) return mid;
                if (matrix[mid][k]==target) return mid;
                if (matrix[mid-1][k]<target) return mid;
                else high = mid - 1;
            }
            else low = mid + 1;
        }
        return -1;
    }
    public boolean search(int [] nums, int target){
        int high = nums.length-1;
        int low = 0;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid]==target) return true;
            else if (nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int k = searchRow(matrix, target);
        if (k == -1) return false;
        return search(matrix[k],target);
    }
}