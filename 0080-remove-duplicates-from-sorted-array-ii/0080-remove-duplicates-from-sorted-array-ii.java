class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3)
          return nums.length;
        
        int k = 2, i;

        for (i = 2; i < nums.length; i++) {
          // System.out.println("Before if condition k=" + k + " i=" + i + " array=" + Arrays.toString(nums));
          if (nums[k - 2] != nums[i]) {
            nums[k++] = nums[i];
          }
          // System.out.println("After if condition k=" + k + " i=" + i + " array=" + Arrays.toString(nums));
        }
        return k;
    }
}