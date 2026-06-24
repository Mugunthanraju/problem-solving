class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False # In either approach this is reasonable
        
        """
            string contains only lowercase english letters
        """
        freq = [0] * 26 # frequency of small letters
        for i in range(len(s)):
            # increment the frequency
            freq[ord(s[i]) - ord('a')] += 1
            # decrement the frequency
            freq[ord(t[i]) - ord('a')] -= 1
        
        for i in range(len(freq)):
            # val will be zero if both str has same char freq
            if freq[i] != 0:
                return False

        """
            ====================================================
            Follow up : if the inputs contain Unicode characters 
        """
        
        # frequency = dict() # Store frequency of Unicode characters
        # for i in range(len(s)):
        #     # increment the frequency
        #     frequency[s[i]] = frequency.get(s[i], 0) + 1
        #     # decrement the frequency
        #     frequency[t[i]] = frequency.get(t[i], 0) - 1
        
        # for val in frequency.values():
        #     # val will be zero if both str has same char freq
        #     if val != 0:
        #         return False
        
        return True