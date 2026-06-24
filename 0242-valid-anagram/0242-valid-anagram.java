class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length())
        //     return false;

        // Map<Integer, Integer> frequency = new HashMap<>();

        // s.codePoints().forEach(cp -> frequency.put(cp, frequency.getOrDefault(cp, 0) + 1));
        
        // int newCount;

        // int[] tCodePoints = t.codePoints().toArray();
        // for (int c : tCodePoints) {
        //     if (!frequency.containsKey(c))
        //         return false;
            
        //     newCount = frequency.get(c) - 1;

        //     if (newCount < 0) {
        //         return false;
        //     } else if (newCount == 0) {
        //         frequency.remove(c);
        //     } else {
        //         frequency.put(c, newCount);
        //     }
        // }

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;

        return true;
    }
}