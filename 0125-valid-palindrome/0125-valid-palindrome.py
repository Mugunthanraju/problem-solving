class Solution:
    def isPalindrome(self, s: str) -> bool:
        start = 0
        end = len(s) - 1

        while start < end:

          if not s[start].isalpha():
            start += 1
          elif not s[end].isalpha():
            end -= 1
          else:
            if s[start].lower() != s[end].lower():
              return False
            
            start += 1
            end -= 1
        
        return True