class Solution {
    public int maxProfit(int[] prices) {
        int current = 0;
        int profit = 0;
        for (int i = prices.length-1; i>=0; i--){
            if(current<prices[i]){
                current = prices[i];
            }
            else{
                profit = Math.max(profit, current-prices[i]);
            }
        }
        return profit;
    }
}