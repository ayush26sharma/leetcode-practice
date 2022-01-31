class Solution {
    public int maxProfit(int[] prices) {
        int a = 0;
        int b = 0;
        for (int i = prices.length-1; i>=0; i--){
            if (a>prices[i]){
                b = Math.max(b,a-prices[i]);
            }
            else{
                a = prices[i];
            }
        }
        return b;
    }
}