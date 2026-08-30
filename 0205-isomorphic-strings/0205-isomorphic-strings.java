class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int sn = s.length(), tn = t.length(), sv, tv;

        if (sn != tn)
            return false;
        
        /*************************************************/
        
        /* Approach 1 : Using Hash Map */

        // Map<Character, Integer> sMap = new HashMap<>();
        // Map<Character, Integer> tMap = new HashMap<>();

        // for (int i = 0; i < sn; i++) {
            
        //     Character sc = s.charAt(i);
        //     Character tc = t.charAt(i);

        //     sv = sMap.getOrDefault(sc, 0);
        //     tv = tMap.getOrDefault(tc, 0);

        //     if (sv != tv)
        //         return false;
            
        //     sMap.put(sc, i + 1);
        //     tMap.put(tc, i + 1);
        // }

        /* Approach 2 : Using Array (Faster) */ 

        int[] sa = new int[256];
        int[] ta = new int[256];

        for (int i = 0; i < sn; i++) {

            Character sc = s.charAt(i);
            Character tc = t.charAt(i);

            if (sa[sc] != ta[tc])
                return false;
            
            sa[sc] = i + 1; 
            ta[tc] = i + 1; 
        }



        /*************************************************/
        return true;
    }
}