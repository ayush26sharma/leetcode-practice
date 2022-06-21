class Solution {
    public int uniquePaths(int m, int n) {
        int x = m+n-2;       //3
        int j = m-1;         //2
        double res = 1;
        for(int i = 1; i<=j; i++){
            // System.out.println(res);
            res = res*(x-j+i)/i;           // (3-2+1)/1       (3-2+2)/2
        }
        return (int) res;
    }
}