class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0 , right = nums.length - 1, temp;

        while (left < right) {
            if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if (nums[left] % 2 == 0) {
                left++;
            }
            else {
                right--;
            }
        }

        return nums;

    }
}