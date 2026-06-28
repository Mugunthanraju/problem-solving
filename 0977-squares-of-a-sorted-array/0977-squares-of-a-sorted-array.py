class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = []

        left = 0
        right = len(nums) - 1

        while left <= right:
          left_sq = nums[left] * nums[left]
          right_sq = nums[right] * nums[right]

          if (left_sq > right_sq):
            result.append(left_sq)
            left += 1
          else:
            result.append(right_sq)
            right -= 1
        
        return result[::-1]