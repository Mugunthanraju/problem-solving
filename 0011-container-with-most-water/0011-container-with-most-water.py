class Solution:
    def maxArea(self, height: List[int]) -> int:
      maxi_area = left = 0
      right = len(height) - 1
        
      while left < right:
        breadth = right - left
        current_height = min(height[left], height[right])
        temp_maxi = breadth * current_height
        maxi_area = max(temp_maxi, maxi_area)
          
        if height[left] > height[right]:
          right -= 1
        else: 
          left += 1
        
      return maxi_area
        