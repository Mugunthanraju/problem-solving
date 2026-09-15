class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        size = len(nums)
        nums.sort()
        output = list()

        for index in range(size - 2):

          if index > 0 and nums[index - 1] == nums[index]:
            continue
          
          left = index + 1
          right = size - 1

          while left < right: 

            total = nums[index] + nums[left] + nums[right]

            if total < 0:
              left += 1
            elif total > 0:
              right -= 1
            else:
              output.append([nums[index], nums[left], nums[right]])
              left += 1
              while left < right and nums[left] == nums[left - 1]:
                left += 1
          
          index += 1
        
        return output
