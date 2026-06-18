class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int vertical = 0;
        int horizontal = 0;
        int maxArea = 0;

        while (left < right) {
            vertical = Math.min(height[left], height[right]);
            horizontal = right - left;
            area = vertical * horizontal;
            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) 
                left++;
            else 
                right--;
        }

        return maxArea;
    }
}