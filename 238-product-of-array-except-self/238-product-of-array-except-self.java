class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] forward = new int [nums.length];
        int [] backward = new int [nums.length];
        int [] res = new int [nums.length];
        forward[0] = nums[0];
        backward[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i<nums.length; i++){
            forward[i] = nums[i]*forward[i-1];
        }
        for(int i = nums.length-2; i>=0 ; i--){
            backward[i] = nums[i]*backward[i+1];
        }
        for(int i = 1; i<nums.length-1; i++){
            res[i] = backward[i+1]*forward[i-1];
        }
        res[0] = backward[1];
        res[nums.length-1] = forward[nums.length-2];
        return res;
    }
}