class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)

        left = 0
        k = right = len(nums) - 1

        while left <= right:
          left_sq = nums[left] * nums[left]
          right_sq = nums[right] * nums[right]

          if (left_sq > right_sq):
            result[k] = left_sq
            left += 1
            k -=1 
          else:
            result[k] = right_sq
            right -= 1
            k -= 1
        
        return result