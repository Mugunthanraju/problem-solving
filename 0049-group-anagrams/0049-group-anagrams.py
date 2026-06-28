class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
      # Creating a dict with default value as List
        groups = defaultdict(list) 

        for word in strs:
          # sorting the chars in str and then convert char list into str
          keyword = "".join(sorted(word))
          groups[keyword].append(word)
        
        return list(groups.values())