package com.array.stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If the current price is greater than the previous day's price, 
            // then it's profitable to buy and sell on those two days.
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Output: " + solution.maxProfit(prices1)); // Output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Output: " + solution.maxProfit(prices2)); // Output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Output: " + solution.maxProfit(prices3)); // Output: 0
    }
}
