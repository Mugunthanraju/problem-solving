class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, pointer;

        for (pointer = 0; pointer < nums.length; pointer++) {
          if (nums[index] != nums[pointer]) {
            nums[++index] = nums[pointer];
          }
        }
        return ++index;
    }
}