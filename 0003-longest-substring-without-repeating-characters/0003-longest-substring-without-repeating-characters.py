class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        unique = set()
        max_len = left = 0

        for right in range(len(s)):
          while s[right] in unique:
            unique.discard(s[left])
            left += 1

          unique.add(s[right])
          max_len = max(right - left + 1, max_len)
        return max_len