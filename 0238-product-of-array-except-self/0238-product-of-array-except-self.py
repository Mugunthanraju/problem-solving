class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        current = 1
        answer = []

        for num in nums:
          answer.append(current)
          current *= num
        
        current = 1
        for i in reversed(range(len(nums))):
          answer[i] = answer[i] * current
          current *= nums[i]
        
        return answer
