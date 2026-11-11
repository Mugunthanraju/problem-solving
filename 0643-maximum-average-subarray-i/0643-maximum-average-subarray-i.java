class Solution {
  public double findMaxAverage(int[] nums, int k) {
    
    int len = nums.length, sum, maxSum;

    sum = Arrays.stream(nums, 0, k).sum();
    maxSum = sum;

    for (int i = k; i < len; i++) {
      sum = sum - nums[i - k] + nums[i];
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