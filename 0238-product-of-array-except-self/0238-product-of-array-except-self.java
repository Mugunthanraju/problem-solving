class Solution {
    public int[] productExceptSelf(int[] nums) {
        int current = 1, len = nums.length, i;
        int[] answer = new int[len];
        
        // Prefix
        for (i = 0; i < len; i++) {
            answer[i] = current;
            current *= nums[i];
        }
        
        // Suffix
        current = 1;
        for (i = len - 1; i > -1; i--) {
            answer[i] *= current;
            current *= nums[i];
        }

        /*
            [1,2,3,4]
            [1,1,2,6]
            [24,12,8,6]
        */
        return answer;

    }
}