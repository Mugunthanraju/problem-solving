class Solution {
    public int removeElement(int[] nums, int val) {

        int index = 0; // Used to in place items except val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Omitting the val from array with the help of condition
                nums[index++] = nums[i]; 
            }
        }

        return index; // Returns number of item count without val
    }
}