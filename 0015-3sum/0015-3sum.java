class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // To get the results right
        int n = nums.length;
        int currentSum = 0;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                // To avoid duplicates, so allowing only one time i.e. (i > 0)
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum > 0) {
                    right--;
                }
                else if (currentSum < 0)
                    left++;
                else {
                    // Here, we got sum equals to zero.
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; // Moving to next

                    while (nums[left] == nums[left - 1] && left < right) {
                        // To avoid duplicates, so allowing only one time i.e. (nums[left] == nums[left - 1])
                        left++;
                    }
                }
            }
        }

        return result;
    }
}