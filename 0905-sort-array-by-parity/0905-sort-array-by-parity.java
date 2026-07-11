class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, swap;

        for (int right = 0; right < nums.length; right++) {
          if (nums[right] % 2 == 0) {
            swap = nums[left];
            nums[left++] = nums[right];
            nums[right] = swap;
          }
        }

        return nums;
    }
}