class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {

          // sorting the chars in str and then convert char array into str
          char[] chars = word.toCharArray();
          Arrays.sort(chars);
          String keyword = new String(chars);

          // Make sure there is arraylist for every keyword to add word
          groups.putIfAbsent(keyword, new ArrayList<>());
          groups.get(keyword).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}