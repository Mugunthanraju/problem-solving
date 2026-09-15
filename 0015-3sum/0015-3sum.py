class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        size = len(nums) - 1
        nums.sort()
        i = 0
        output = list()

        for i in range(size - 1):

          if i > 0 and nums[i - 1] == nums[i]:
            continue
          
          j = i + 1
          k = size 

          while j < k: 

            total = nums[i] + nums[j] + nums[k]

            if total < 0:
              j += 1
            elif total > 0:
              k -= 1
            else:
              output.append([nums[i], nums[j], nums[k]])
              j += 1
              while j < k and nums[j] == nums[j - 1]:
                j += 1
          
          i += 1
        
        return output
