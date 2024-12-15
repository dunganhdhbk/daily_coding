package com.dungtda.day1;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                continue;
            }

            if (maxProfit < prices[i] - buy) {
                maxProfit = prices[i] - buy;
            }

        }
        return maxProfit;
    }


}
