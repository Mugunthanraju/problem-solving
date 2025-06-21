class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = Integer.MAX_VALUE / 2; // To avoid overflow
        int current_sum = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                current_sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(current_sum - target) < Math.abs(closest_sum - target)) {
                    closest_sum = current_sum; // compare & assign small value to closest
                }

                if (current_sum < target)
                    left++;
                else if (current_sum > target)
                    right--;
                else {
                    return current_sum; // equals to target
                }
            }
        }
        return closest_sum;

    }
}