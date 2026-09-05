class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi = float('-inf')
        total = 0

        for num in nums:
          total = max(total + num, num)
          maxi = max(total, maxi)
        
        return maxi