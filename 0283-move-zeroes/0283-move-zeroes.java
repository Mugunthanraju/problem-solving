class Solution {
    public void moveZeroes(int[] nums) {

        /* Solution - 1 : Not so Optimized TC : O(N) */

        // int index = 0, n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != 0)
        //         nums[index++] = nums[i];
        // }

        // while (index < n) {
        //     nums[index++] = 0;
        // }

        /* Solution - 2 : Optimized TC : O(N) */

        int index = 0; // Points to the next position to place a non-zero element
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, swap it with the element at 'index'
            if (nums[i] != 0) {
                swap(nums, index, i);
                index++;
            }
        }
    }

    public void swap(int nums[], int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}