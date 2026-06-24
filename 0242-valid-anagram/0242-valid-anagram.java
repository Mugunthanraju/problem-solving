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
        Map<Integer, Integer> frequency = new HashMap<>();
        // increment the frequency
        s.codePoints().forEach(scp -> 
            frequency.put(scp, frequency.getOrDefault(scp, 0) + 1)
        );
            // decrement the frequency
        t.codePoints().forEach(tcp -> 
            frequency.put(tcp, frequency.getOrDefault(tcp, 0) - 1)
        );

        for(var c : frequency.values()) {
            // val will be zero if both str has same char freq
            if (c != 0)
                return false;
        }

        return true; // This is same for any case
    }
}