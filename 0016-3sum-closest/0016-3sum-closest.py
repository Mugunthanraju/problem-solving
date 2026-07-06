class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        size = len(nums)
        nums.sort()
        closer = nums[0] + nums[1] + nums[2] 

        for index in range(size - 2):

          if index > 0 and nums[index - 1] == nums[index]:
            continue
          
          left = index + 1
          right = size - 1

          while left < right:

            total = nums[index] + nums[left] + nums[right]
            abs_current_diff = abs(total - target)
            abs_closer_diff = abs(closer - target)

            if abs_current_diff < abs_closer_diff:
              closer = total

            if total > target:
              right -= 1
            elif total < target:
              left += 1
            else:
              return total
          
        return closer

            
            