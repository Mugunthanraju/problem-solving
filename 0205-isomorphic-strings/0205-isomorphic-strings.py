class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
          return False

        sa = [0] * 256
        ta = [0] * 256

        for i in range(len(s)):
          si = ord(s[i])
          ti = ord(t[i])

          if sa[si] != ta[ti]:
            return False

          sa[si] += 1
          ta[ti] += 1
        
        return True
      
