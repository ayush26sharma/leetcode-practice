class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 1;
        int blue = 2;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==0) red++;
            else if (nums[i]==1) white++;
            else blue++;
        }
        int i = 0;
        while(i<red){
            nums[i]=0;
            i++;
        }
        while(i<red+white-1){
            nums[i]=1;
            i++;
        }
        while(i<nums.length){
            nums[i]=2;
            i++;
        }
    }
}