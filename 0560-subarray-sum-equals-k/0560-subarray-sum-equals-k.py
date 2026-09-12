class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        perfix_sum = {0: 1}
        total_sum = sub_array_count = 0

        for num in nums:
          total_sum += num
          difference = total_sum - k
          sub_array_count += perfix_sum.get(difference, 0)
          perfix_sum[total_sum] = perfix_sum.get(total_sum, 0) + 1

        return sub_array_count