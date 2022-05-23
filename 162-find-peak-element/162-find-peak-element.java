class Solution {
    
    public int findPeakElement(int[] nums) {
        if (nums.length==1) return 0;
        if (nums.length==2 && nums[0]<nums[1]) return 1;
        if (nums.length==2 && nums[1]<nums[0]) return 0;
        int high = nums.length-1;
        int low = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (mid==0 || mid == nums.length-1){
                if(mid==0){
                    if(nums[mid]>nums[mid+1]) return mid;
                    else{
                        if (nums[mid]<nums[mid+1]) low = mid+1;
                        else high = mid-1;
                    }
                }
                else{
                    if(nums[mid]>nums[mid-1]) return mid;
                    else{
                        if (nums[mid]<nums[mid-1]) high = mid-1;
                        else low = mid+1;    
                    }
                }
            }
            else{
                if (nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) return mid;
                else if (nums[mid]<nums[mid-1]) high = mid-1;
                else if (nums[mid]<nums[mid+1]) low = mid+1;
            }
        }
        return -1;
    }
}