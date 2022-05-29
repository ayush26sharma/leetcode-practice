class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int length = 99999999;
        int sum = 0;
        while(low<nums.length){
            while(sum<target && high<nums.length){
                sum += nums[high];
                high++;
            }
            if (sum >= target) length = Math.min(length, high-low);
            sum -= nums[low];
            low++;
        }
        if (length == 99999999) return 0;
        return length;
    }
}