class Solution {
    public List<Integer> findLonely(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i: nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        
        for(int i : nums){
            if (map.get(i)==1 && !map.containsKey(i+1) && !map.containsKey(i-1)) arr.add(i);
        }
        return arr;
    }
}