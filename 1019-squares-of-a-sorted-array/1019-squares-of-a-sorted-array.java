class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // Storing square numbers
        int left = 0, right = n - 1;
        
        // Reuse n in result indexing
        for (n = n - 1; n > -1; n--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                // Find greater absolute value & store the square of it
                result[n] = nums[left] * nums[left];
                left++;
            } else {
                // Store lesser or equal absolute sqaure value
                result[n] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}