class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        original = set()

        for num in nums:
          if num in original:
            return True
          original.add(num)

        return False

        # return (len(nums) != len(set(nums)))