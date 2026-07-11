class Solution {
    public long minimumSteps(String s) {
      if (s.length() < 2)
        return 0;

      long swap = 0;
      int black = 0;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0')
          swap += (long) black;
        else
          ++black;
      }

      return swap;
    }
}