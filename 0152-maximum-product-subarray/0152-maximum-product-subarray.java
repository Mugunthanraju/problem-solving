class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0], minProduct = nums[0], best = nums[0], temp;

        /*
        Why track both maximum and minimum products ending at the current position?
        Because multiplying by a negative number can turn the smallest negative product into the largest positive product. 
        */

        for (int i = 1; i < nums.length; i++) {

          if (nums[i] < 0) {
            // if num is -ve, the previous minProduct can potentially become the new maxProduct.
            temp = maxProduct;
            maxProduct = minProduct;
            minProduct = temp;
          }

          maxProduct = Math.max(nums[i], nums[i] * maxProduct);
          minProduct = Math.min(nums[i], nums[i] * minProduct);
          best = Math.max(maxProduct, best);
        }
        return best;
    }
}