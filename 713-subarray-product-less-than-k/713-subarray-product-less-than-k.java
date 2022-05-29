class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1) return 0;
        int product = 1;
        int res = 0;
        int low = 0;
        int high = 0;
        while(high < nums.length){
            product *= nums[high];
            while(product >= k){
                product /= nums[low];
                low++;
            }
            res += high - low + 1;
            high++;
        }
        return res;
    }
}