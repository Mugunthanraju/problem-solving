class Solution {
    public void sortColors(int[] nums) {

        int zero = 0, one = 0, two = 0, index = 0;

        for (int i = 0; i < nums.length; i++) {
            // Couting 0s, 1s & 2s

            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
            else
                two++;
        }

        // Replacing 0s, 1s, & 2s in array

        while (zero > 0) {
            nums[index++] = 0;
            zero--;
        }

        while (one > 0) {
            nums[index++] = 1;
            one--;
        }

        while (two > 0) {
            nums[index++] = 2;
            two--;
        }
    }
}