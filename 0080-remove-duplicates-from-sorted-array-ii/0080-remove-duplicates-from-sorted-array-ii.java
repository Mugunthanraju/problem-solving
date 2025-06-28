class Solution {
    public int removeDuplicates(int[] nums) {

        // index points to the position to insert the next valid element
        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is not equal to the element at index - 2
            // This ensures we allow at most two duplicates
            if (nums[index - 2] != nums[i])
                nums[index++] = nums[i]; 
        }

        // index is the new length of the array with duplicates allowed at most twice
        return index;
    }
}