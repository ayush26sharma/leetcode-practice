class Solution {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        int area = 0;
        while (i<j){
            int length = Math.min(nums[i], nums[j]);
            int breadth = j-i;
            int k = length*breadth;
            if (area<k) area = k;
            if (nums[i]<=nums[j]) i++;
            else j--;
        }
        return area;
    }
}