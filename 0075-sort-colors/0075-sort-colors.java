class Solution {

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void sortColors(int[] nums) {

        /*
        
         Solution - 1 : Optimized ( Dutch National Flag algorithm ) 
        
        Input Array = [2,0,2,1,1,0], low = 0, mid = 0, high = 5

        Step 1 : [0, 0, 2, 1, 1, 2], low = 0, mid = 0, high = 4

        Step 2 : [0, 0, 2, 1, 1, 2], low = 1, mid = 1, high = 4

        Step 3 : [0, 0, 2, 1, 1, 2], low = 2, mid = 2, high = 4

        Step 4 : [0, 0, 1, 1, 2, 2], low = 2, mid = 2, high = 3

        Step 5 : [0, 0, 1, 1, 2, 2], low = 2, mid = 3, high = 3

        Step 6 : [0, 0, 1, 1, 2, 2], low = 2, mid = 4, high = 3
        
        */
        
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }


        /* Solution - 2 : Not so Optimized */

        // int zero = 0, one = 0, two = 0, index = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     /* Couting 0s, 1s & 2s */

        //     if (nums[i] == 0)
        //         zero++;
        //     else if (nums[i] == 1)
        //         one++;
        //     else
        //         two++;
        // }

        // /* Replacing 0s, 1s, & 2s in array */

        // while (zero > 0) {
        //     nums[index++] = 0;
        //     zero--;
        // }

        // while (one > 0) {
        //     nums[index++] = 1;
        //     one--;
        // }

        // while (two > 0) {
        //     nums[index++] = 2;
        //     two--;
        // }
    }

}