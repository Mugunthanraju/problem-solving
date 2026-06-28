class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {

          // /* 
          //   sorting the chars in str and then convert char array into str
          // */
          // char[] chars = word.toCharArray();
          // Arrays.sort(chars);
          // String keyword = new String(chars);

          int[] count = new int[26];
            
            // Count character frequencies
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Build a string signature from the frequency array
            StringBuilder sb = new StringBuilder();
            for (int val : count) {
                sb.append('#');
                sb.append(val);
            }
            String keyword = sb.toString();

          // Make sure there is arraylist for every keyword to add word
          groups.putIfAbsent(keyword, new ArrayList<>());
          groups.get(keyword).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}