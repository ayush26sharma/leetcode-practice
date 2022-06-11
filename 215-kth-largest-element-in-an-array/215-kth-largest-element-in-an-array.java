class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.parallelSort(nums);
        return nums[nums.length-k];
    }
}