class Solution {
    public int findDuplicate(int[] nums) {

        if (nums.length > 1) {

            // Step 1: Use Floyd's Tortoise and Hare to find the intersection point

            int slow = nums[0];
            int fast = nums[nums[0]];

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } // Step 1 will just proves a cycle exists

            // Step 2: Find the entrance to the cycle (duplicate number)

            fast = 0;

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow; // Step 2: Actual duplicate number
        }

        return -1;
    }
}