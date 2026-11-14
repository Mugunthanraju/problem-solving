class Solution {
    public int trap(int[] height) {
        int head = 0, tail = height.length - 1;
        int water = 0, leftMax = 0, rightMax = 0;

        while (head < tail) {
          if (height[head] < height[tail] ) {
            leftMax = Math.max(leftMax, height[head]);
            water += leftMax - height[head];
            head++;
          } else {
            rightMax = Math.max(rightMax, height[tail]);
            water += rightMax - height[tail];
            tail--;
          }
        }
        return water;
    }
}