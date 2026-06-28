class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
          char[] chars = word.toCharArray();

          Arrays.sort(chars);
          String keyword = new String(chars);

          if (!groups.containsKey(keyword)) {
            groups.put(keyword, new ArrayList<>());
          }
          groups.get(keyword).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}