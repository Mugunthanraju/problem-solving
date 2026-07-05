class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = list()
        nums.sort()
        size = len(nums)
        
        for i in range(size - 2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            
            left = i + 1
            right = size - 1

            while (left < right):
                total = nums[i] + nums[left] + nums[right]

                if total < 0:
                    left += 1
                elif total > 0:
                    right -= 1
                else:
                    result.append([nums[i] , nums[left] , nums[right]])
                    left += 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
        
        return result