class Solution {
    public int maxProfit(int[] prices) {
        int b=0,s=1;
        int maxProfit=0;
        while(s<prices.length){
            if (prices[s] < prices[b]) {
                b = s;
            } else {
                maxProfit = Math.max(maxProfit, prices[s] - prices[b]);
            }
            s++;
        }
        return maxProfit;
    }
}
