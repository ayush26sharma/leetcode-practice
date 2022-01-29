class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], 2);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        int m=0;
        for (int i = 0; i<nums.length; i++){
            if (hash.get(nums[i])==1){
                m = nums[i];
                break;
            }
        }
        return m;
    }
}