class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right;

        for (right = 1; right < nums.length; right++) {
          if (nums[left] != nums[right]) {
            nums[++left] = nums[right];
          }
        }

        return left + 1;
    }
}