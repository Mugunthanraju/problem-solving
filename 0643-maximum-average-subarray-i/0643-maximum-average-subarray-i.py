class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:

        max_sum = total = sum(nums[:k])

        for i in range(k, len(nums)):
          total += nums[i] - nums[i - k]
          max_sum = max(total, max_sum)

        return max_sum / k 