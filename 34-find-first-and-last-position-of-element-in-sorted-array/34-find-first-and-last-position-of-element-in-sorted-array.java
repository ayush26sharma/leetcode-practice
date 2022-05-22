class Solution {
    public int first(int[] nums, int target){
        int high = nums.length-1;
        int low = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                if (mid == 0 || nums[mid-1]<target) return mid;
                else high = mid-1;
            }
            else if (nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public int last(int[] nums, int target){
        int high = nums.length-1;
        int low = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target && (mid == nums.length-1 || nums[mid+1]>target)){
                return mid;
            }
            else if (nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int [2];
        arr[0] = first(nums, target);
        arr[1] = last(nums, target);
        return arr;
    }
}