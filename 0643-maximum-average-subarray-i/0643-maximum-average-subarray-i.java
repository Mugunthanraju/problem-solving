class Solution {
  public double findMaxAverage(int[] nums, int k) {
    
    int len = nums.length, sum, maxSum;

    maxSum = Arrays.stream(nums, 0, k).sum();
    sum = maxSum;

    for (int i = k; i < len; i++) {
      sum += nums[i] - nums[i - k];
      maxSum = Math.max(maxSum, sum);
    }

    return (double) maxSum / k;
    
    /*
        Brute Force Solution
    */
    
    // double avg = -Double.MAX_VALUE, kd = (double) k;
    // if (nums.length <= k)
    //   return Arrays.stream(nums, 0, nums.length).sum() / kd;

    // for (int startRange = 0, endRange = k; endRange <= nums.length; startRange++, endRange++) {
    //   avg = Math.max(avg, Arrays.stream(nums, startRange, endRange).sum() / kd);
    // }
    // return avg;

  }
}