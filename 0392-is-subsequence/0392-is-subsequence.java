class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        int subCount = 0, original = 0;

        while (original < t.length()) {
            if (s.charAt(subCount) == t.charAt(original))
            {
                subCount++;

                if (subCount >= s.length())
                    return true;
            }
            original++;
        }

        return false;
    }
}