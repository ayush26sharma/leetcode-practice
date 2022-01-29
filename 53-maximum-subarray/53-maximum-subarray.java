class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int a = 0;
        
        for(int i=0;i<nums.length;i++){
            a += nums[i];
            if (a>max){
                max = a;
            }
            if(a<0){
                a = 0;
            }
        }
        
        return max;
    }
}