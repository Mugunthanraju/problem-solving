class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); // To handle duplicates in 2 pointers
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicates for i with previous value
            if ( i > 0 && nums[i - 1] == nums[i]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicates for j with previous value
                if (j > i + 1 && nums[j - 1] == nums[j]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long currentSum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (currentSum < target) {
                        left++;
                    }
                    else if (currentSum > target) {
                        right--;
                    }
                    else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for left with previous value
                        while(left < right && nums[left - 1] == nums[left]) left++;
                        // Skip duplicates for right with previous value
                        while(left < right && nums[right + 1] == nums[right]) right--;
                    }
                }
            }
        }

        return result;
        /*
        TC : O(N^3)
        SC : O(K) -> K is no. of result
        */
    }
}