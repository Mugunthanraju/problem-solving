class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        result = maxProduct = minProduct = nums[0]

        for x in nums[1:]:

          if x < 0: 
            maxProduct, minProduct = minProduct, maxProduct
          
          maxProduct = max(x, maxProduct * x)
          minProduct = min(x, minProduct * x)

          result = max(maxProduct, result)
        
        return result