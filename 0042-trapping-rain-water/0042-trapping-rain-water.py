class Solution:
    def trap(self, height: list[int]) -> int:
        head, tail = 0, len(height) - 1
        left_max, right_max = height[head], height[tail]
        units = 0

        while head < tail:

          if left_max < right_max:
            head += 1
            left_max = max(left_max, height[head])
            units += (left_max - height[head])
          else:
            tail -= 1
            right_max = max(right_max, height[tail])
            units += (right_max - height[tail])
          
        return units