class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            int a = 0;
            while(i<nums.length && nums[i]==1){
                a++; i++;
            }
            max = Math.max(a,max);
        }
        return max;
    }
}