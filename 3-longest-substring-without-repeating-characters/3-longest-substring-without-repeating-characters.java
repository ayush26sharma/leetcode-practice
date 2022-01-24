class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int max = 0;
        while(i<s.length()){
            HashMap<Character, Integer> arr = new HashMap<>();
            int counter = 0;
            while(i<s.length() && !arr.containsKey(s.charAt(i))){
                arr.put(s.charAt(i),i);
                counter++;
                i++;
            }
            if (i<s.length()) i = arr.get(s.charAt(i))+1;
            if (max<counter){
                max=counter;
            }
        }
        return max;
    }
}