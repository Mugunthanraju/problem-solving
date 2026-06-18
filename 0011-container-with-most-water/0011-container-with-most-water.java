class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int vertical = 0;
        int horizontal = 0;
        int maxArea = 0;

        while (left < right) {
            vertical = Math.min(height[left], height[right]);
            horizontal = right - left;
            maxArea = Math.max((vertical * horizontal), maxArea);

            if (height[left] < height[right]) 
                left++;
            else 
                right--;
        }

        return maxArea;
    }
}