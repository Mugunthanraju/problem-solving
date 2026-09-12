class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        
        int totalSum = 0, subArrayCount = 0, difference = 0;

        for (int num : nums) {
          totalSum += num;
          difference = totalSum - k;
          subArrayCount += prefixSum.getOrDefault(difference, 0);
          prefixSum.put(totalSum, prefixSum.getOrDefault(totalSum, 0) + 1);
        }

        return subArrayCount;
    }
}