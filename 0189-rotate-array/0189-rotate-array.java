class Solution {

    private void reverser(int[] arr, int start, int end) {
      int temp = 0;
      while (start < end) {
        temp = arr[end];
        arr[end--] = arr[start];
        arr[start++] = temp;
      }
    }

    public void rotate(int[] nums, int k) {
      int n = nums.length;
      k %= n; // just to contain within the nums length range

      reverser(nums, 0, n - 1); // complete array
      reverser(nums, 0, k - 1); // from 0 to before k
      reverser(nums, k, n - 1); // from k to last
    }
}