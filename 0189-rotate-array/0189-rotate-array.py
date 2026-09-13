class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swaps(arr, start, end):
          while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1
          return True
        
        k %= len(nums)

        swaps(nums, 0, len(nums) - 1)
        swaps(nums, k, len(nums) - 1)
        swaps(nums, 0, k - 1)
