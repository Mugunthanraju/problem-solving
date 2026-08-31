class Solution {
    public int[] productExceptSelf(int[] nums) {
        int current = 1;
        int answer[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
          answer[i] = current;
          current *= nums[i];
        }

        current = 1;
        for (int i = nums.length - 1; i > -1; i--) {
          answer[i] *= current;
          current *= nums[i];
        }

        return answer;
    }
}