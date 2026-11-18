class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      int maxCount = 0;
      Set<Character> unique = new HashSet<>();

      for (int right = 0, left = 0; right < s.length(); right++) {
        
        while (!unique.add(s.charAt(right))) 
          unique.remove(s.charAt(left++));
        
        maxCount = Math.max(right - left + 1, maxCount);
      }

      return maxCount;
    }
}