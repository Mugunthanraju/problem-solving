class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        nums = set(nums)
        longest = 0

        for num in nums:
          # just to make sure consective nums start from prev num of the current
          if num - 1 not in nums:
            temp = num
            while temp in nums:
              temp += 1
              longest = max(longest, temp - num)
        
        return longest