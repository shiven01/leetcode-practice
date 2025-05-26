class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);

            if ((prices[i] - min) <= 0) {
                min = prices[i];
            }
        }

        return maxProfit;
    }
}
