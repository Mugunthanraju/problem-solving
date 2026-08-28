class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums){
          numbers.add(num);
        }
        int longest = 0;

        for (var num : numbers) {
          // Just not to miss its prev number for consecutive sequence
          if (!numbers.contains(num - 1)) {
            int y = num;
            while (numbers.contains(y)) {
              ++y;
              longest = Math.max(longest, y - num);
            }
          }
        }
        return longest;
    }
}