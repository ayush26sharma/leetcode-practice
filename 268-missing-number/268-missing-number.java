class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<=nums.length; i++){
            hash.put(i,1);
        }
        for(int i : nums){
            if (hash.containsKey(i)) hash.put(i, hash.get(i)+1);
        }
        int m = 0;
        for (int i: hash.keySet()){
            if (hash.get(i)==1) {
                m=i;
                break;                 
            }
        }
        return m;
    }
}