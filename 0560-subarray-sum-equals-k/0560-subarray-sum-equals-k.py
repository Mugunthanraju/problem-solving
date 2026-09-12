class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix_sum = {0: 1}
        total_sum = sub_array_count = 0

        for num in nums:
          total_sum += num
          difference = total_sum - k
          sub_array_count += prefix_sum.get(difference, 0)
          prefix_sum[total_sum] = prefix_sum.get(total_sum, 0) + 1

        return sub_array_count