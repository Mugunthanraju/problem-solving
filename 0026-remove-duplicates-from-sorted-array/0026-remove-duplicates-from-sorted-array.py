class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
      index = 0

      for pointer in range(len(nums)):
        if nums[index] != nums[pointer]:
          index += 1
          nums[index] = nums[pointer]
      
      return index + 1