class Solution {
    public boolean isAnagram(String s, String t) {
        
        // /* If string contains only lowercase english letters */
        // int[] alphabet = new int[26];
        // for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        // for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        // for (int i : alphabet) if (i != 0) return false;

        /* 
            Follow up : if the inputs contain Unicode characters 
        */

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> frequency = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            frequency.put(s.charAt(index), frequency.getOrDefault(s.charAt(index), 0) + 1);
            frequency.put(t.charAt(index), frequency.getOrDefault(t.charAt(index), 0) - 1);
        }

        for(char c : frequency.keySet()) {
            if (frequency.get(c) != 0)
                return false;
        }

        return true; // This is same for any case
    }
}