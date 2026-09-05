class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
          // Kadane Algo : add → update maximum → reset if -ve
          currentSum = Math.max(currentSum + num, num);
          maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}