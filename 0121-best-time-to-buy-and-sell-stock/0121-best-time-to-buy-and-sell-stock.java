class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE, profit = 0;

        for (int price : prices) {
          lowest = Math.min(price, lowest);
          profit = Math.max(price - lowest, profit);
        }

        return profit;
    }
}