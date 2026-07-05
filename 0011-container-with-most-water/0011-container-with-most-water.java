class Solution {
	public int maxArea(int[] heights) {
		int maxiArea = 0, left = 0, right = heights.length - 1;
        int breadth, minHeight, tempMaxi;
		
		while (left < right) {
			breadth = right - left;
			minHeight = Math.min(heights[left], heights[right]);
			tempMaxi = breadth * minHeight;
			maxiArea = Math.max(maxiArea, tempMaxi);
			if (heights[left] > heights[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxiArea;
	}
}