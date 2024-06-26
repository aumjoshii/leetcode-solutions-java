//#122

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i <prices.length; i++) {
            if(prices[i] > prices[i-1]){
                int currentProfit = prices[i] - prices[i-1];
                maxProfit += currentProfit;
            }
        }
        return maxProfit;
    }
}
