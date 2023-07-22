class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (x,y)->x[1]-y[1]);
        int res = 1;
        int [] curr = pairs[0];
        int i = 1;
        while(i<pairs.length){
            if(curr[1]<pairs[i][0]){
                curr=pairs[i];
                res++;
                i++;
                
            }
            else i++;
        }
        
        // if()
        
        return res;
    }
}