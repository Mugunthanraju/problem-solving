class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
            return false; // In either approach this is reasonable


        // /* If string contains only lowercase english letters */
        // int[] alphabet = new int[26]; // frequency of small letters
        // for (int i = 0; i < s.length(); i++) {
        //     alphabet[s.charAt(i) - 'a']++; // increment the frequency
        //     alphabet[t.charAt(i) - 'a']--; // decrement the frequency
        // }
        // for (int i : alphabet) 
        //     if (i != 0) // val will be zero if both str has same char freq
        //         return false; 

        /* 
            ====================================================
            Follow up : if the inputs contain Unicode characters 
        */

        // Store frequency of Unicode characters
        Map<Character, Integer> frequency = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            // increment the frequency
            frequency.put(s.charAt(index), frequency.getOrDefault(s.charAt(index), 0) + 1);
            // decrement the frequency
            frequency.put(t.charAt(index), frequency.getOrDefault(t.charAt(index), 0) - 1);
        }

        for(char c : frequency.keySet()) {
            // val will be zero if both str has same char freq
            if (frequency.get(c) != 0)
                return false;
        }

        return true; // This is same for any case
    }
}