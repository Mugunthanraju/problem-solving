class Solution {
	public int maxArea(int[] heights) {
		int maxiArea = 0, left = 0, right = heights.length - 1;
    int breadth, minHeight, area;
		
		while (left < right) {
			breadth = right - left;
			minHeight = Math.min(heights[left], heights[right]);
			area = breadth * minHeight;
			maxiArea = Math.max(maxiArea, area);
			if (heights[left] > heights[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxiArea;
	}
}