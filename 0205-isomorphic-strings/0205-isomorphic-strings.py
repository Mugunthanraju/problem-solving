class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
          return False
        
        sa = {}
        ta = {}

        for i in range(len(s)):
          si = s[i]
          ti = t[i]

          if sa.get(si) != ta.get(ti):
            return False

          sa[si] = i + 1
          ta[ti] = i + 1
        
        return True
      
