class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(arr, start, end):
          while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1
          return True
        
        k %= len(nums)

        reverse(nums, 0, len(nums) - 1) # complete array
        reverse(nums, k, len(nums) - 1) # from k to last
        reverse(nums, 0, k - 1) # from 0 to before k
