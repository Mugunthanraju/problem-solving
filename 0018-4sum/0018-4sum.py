class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:

      nums.sort()
      n = len(nums)
      result = list()

      for i in range(n - 3):
        if i > 0 and nums[i] == nums[i - 1]:
          continue

        for j in range(i + 1, n - 2):

          if j > (i + 1) and nums[j] == nums[j - 1]:
            continue

          left = j + 1
          right = n - 1

          while left < right:

            total = nums[i] + nums[j] + nums[left] + nums[right]

            if total < target:
              left += 1
            elif total > target:
              right -= 1
            else:
              result.append([nums[i] , nums[j] , nums[left] , nums[right]])
              left += 1
              right -= 1

              while left < right and nums[left - 1] == nums[left]:
                left += 1
              
              while left < right and nums[right + 1] == nums[right]:
                right -= 1
        
      return result
