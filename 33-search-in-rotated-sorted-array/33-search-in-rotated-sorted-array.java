class Solution {
    public int pivot(int [] nums){
        int high = nums.length-1;
        int low = 0;
        if (nums.length==1 || nums.length==0){
            return -1;
        }
        if (nums.length==2){
            if (nums[0]<nums[1]) return -1;
            else return 0;
        }
        while (low<=high){
            int mid = low + (high-low)/2;
            if (mid != 0){
                if (nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) return mid;
                else{
                if (nums[mid]>nums[nums.length-1]) low = mid + 1;
                else high = mid - 1;
            }
            }
            else if (mid == 0){
                if (nums[mid] > nums[mid+1]) return mid;
                else{
                if (nums[mid]>nums[nums.length-1]) low = mid + 1;
                else high = mid - 1;
            }
            }
            else{
                if (nums[mid]>nums[nums.length-1]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
    public int search(int [] nums, int target, int low, int high){
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int a = pivot(nums);
        if (a!=-1) return Math.max(search(nums, target, 0, a), search(nums, target, a+1, nums.length-1));
        else return search(nums, target, 0, nums.length-1);
    }
}