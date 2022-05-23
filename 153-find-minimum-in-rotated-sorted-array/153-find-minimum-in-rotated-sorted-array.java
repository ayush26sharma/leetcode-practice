class Solution {
    
    public int pivot(int [] nums){
        int low = 0;
        int high = nums.length-1;
        if (nums.length==1) return -1;
        if (nums.length == 2 && nums[0]<nums[1]) return -1;
        else if (nums.length == 2 && nums[0]>nums[1]) return 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (mid!=0){
                if(nums[mid-1]<nums[mid] &&nums[mid]>nums[mid+1]) return mid;
                else{
                    if (nums[mid]>nums[nums.length-1]) low = mid+1;
                    else high = mid-1;
                }
            }
            else{
                if(nums[mid]>nums[mid+1]) return mid;
                else{
                    if (nums[mid]>nums[nums.length-1]) low = mid+1;
                    else high = mid-1;
                }
            }
        }
        return -1;
    }
    
    public int findMin(int[] nums) {
        int a = pivot(nums);
        if (a==-1) return nums[0];
        return nums[a+1];
    }
}