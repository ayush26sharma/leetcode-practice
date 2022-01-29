class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; int j = 1;
        while(j<nums.length){
            if (nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
    
            }
            else{
                while(nums[i]==nums[j]){
                    j++;
                   if (j==nums.length){
                      break;
                   }
                }
            }
        }
        i+=1;
        return i;
    }
}