class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum_subarray = float('-inf')
        current_sum = 0

        for num in nums:
          # Kadane Algo : add → update maximum → reset if -ve
          current_sum = max(current_sum + num, num)
          max_sum_subarray = max(current_sum, max_sum_subarray)
        
        return max_sum_subarray