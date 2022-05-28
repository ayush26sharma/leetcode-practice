class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] phash= new int[26];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<p.length(); i++){
            phash[p.charAt(i)-97]++;
        }
        int k = p.length();
        int m = 0;
        while(m<=s.length()-p.length()){
            int [] shash= new int[26];
            for(int i = m; i<m+p.length(); i++){
                shash[s.charAt(i)-97]++;
            }
            if(Arrays.equals(phash, shash)){ 
                arr.add(m);
                System.out.println(1234);
            }
            m++;
        }
        return arr;
    }
}