class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lowest = 11111
        profit = 0

        for price in prices:
          lowest = min(price, lowest)
          profit = max(price - lowest, profit)
        
        return profit