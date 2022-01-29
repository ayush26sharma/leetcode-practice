class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap <Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if (hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i]) + 1);
            }
            else{
                hash.put(nums[i], 1);
            }
        }
        int m = 0;
        int j = 0;
        for (int i = 0; i<nums.length;i++){
            //System.out.println(hash.get(A[i]));
            if(m<hash.get(nums[i])){
                m = hash.get(nums[i]);
                j = nums[i];
            }
        }
        return j; 
    }
}