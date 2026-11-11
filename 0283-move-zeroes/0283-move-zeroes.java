class Solution {
    public void moveZeroes(int[] nums) {

        for (int right = 0, left = 0, temp; right < nums.length; right++) {
          if (nums[right] != 0) {
            temp = nums[right];
            nums[right] = nums[left];
            nums[left++] = temp;
          }
        }
    }
}