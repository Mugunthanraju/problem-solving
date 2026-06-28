class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for word in strs:
          keyword = "".join(sorted(word))
          if keyword not in groups:
            groups[keyword] = []
          groups[keyword].append(word)
        
        return list(groups.values())