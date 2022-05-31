class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int x = target-nums[i];
            if(map.containsKey(x)){
                arr[0] = i;
                arr[1] = map.get(x);
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}