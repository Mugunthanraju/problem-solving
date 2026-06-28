class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length, left = 0, right, p, leftSq, rightSq;
      right = p = n - 1;
      int[] result = new int[n];

        while(left <= right) {
          leftSq = nums[left] * nums[left];
          rightSq = nums[right] * nums[right];

          if (leftSq > rightSq) {
            result[p--] = leftSq;
            left++;
          } else {
            result[p--] = rightSq;
            right--;
          }
        }

        return result;
    }
}