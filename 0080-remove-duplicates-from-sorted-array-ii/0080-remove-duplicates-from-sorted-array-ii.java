class Solution {
    public int removeDuplicates(int[] nums) {


        int index = 2; // Because we allow 1 duplicate

        for (int i = 2; i < nums.length; i++) {
            if (nums[index - 2] != nums[i])
                nums[index++] = nums[i]; // Check first item with current item
        }

        return index;
    }
}