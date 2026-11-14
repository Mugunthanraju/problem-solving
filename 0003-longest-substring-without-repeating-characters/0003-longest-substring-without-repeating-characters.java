class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        Set<Character> charSet = new HashSet<>();

        int left = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left++));
            }
            charSet.add(s.charAt(right));
            maxLen = Math.max(right - left + 1, maxLen);
        }

        return maxLen;
    
    }
}