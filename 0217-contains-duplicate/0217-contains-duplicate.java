class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            //  Returns true if added, false if it was a duplicate
            if (!unique.add(num))
                return true;
        }
        return false;
    }
}