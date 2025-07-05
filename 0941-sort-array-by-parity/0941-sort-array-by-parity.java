class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0 , right = nums.length - 1;

        /* Solution - 1 : In place Array Modification */ 

        int temp;
        while (left < right) {
            if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                /* Odd @ L & Even @ R then swap */
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if (nums[left] % 2 == 0) {
                /* Even @ L */
                left++;
            }
            else {
                /* Odd @ R */
                right--;
            }
        }
        return nums;

        /* Solution - 2 : Create new array with same length for result */

        // int[] result = new int[nums.length];
        // for (int num : nums) {
        //     if (num % 2 == 0) {
        //         result[left++] = num;
        //     } else {
        //         result[right--] = num;
        //     }
        // }
        // return result;

    }
}