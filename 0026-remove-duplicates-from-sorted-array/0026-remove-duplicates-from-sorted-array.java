class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[count - 1] != nums[i]) // Check previous numbers is equal to ith index item.
                nums[count++] = nums[i]; // If not, copy the value in count index and increment count.
        }

        return count;
    }
}