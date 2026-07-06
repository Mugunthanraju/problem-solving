class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        size = len(nums)
        closer = 200000
        nums.sort()

        for i in range(size - 1):

          if i > 0 and nums[i - 1] == nums[i]:
            continue
          
          left = i + 1
          right = size - 1

          while left < right:

            total = nums[i] + nums[left] + nums[right]
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

            
            