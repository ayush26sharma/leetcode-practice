class Solution {
    public int maxScore(int[] nums, int k) {
        int res = 0;
        int i = 0;
        int x = nums.length-1;
        for(i = 0; i<k; i++){
            res+=nums[i];
            // max = Math.max(res, max);
        }
        int max = res;
        while(i-->0){
            res += (nums[x]-nums[i]);
            x--;
            max = Math.max(res, max);
        }
        return max;
    }
}