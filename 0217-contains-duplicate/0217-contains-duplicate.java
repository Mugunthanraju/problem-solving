class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) {
            if (unique.contains(num))
                return true;
            else
                unique.add(num);
        }
        return false;
    }
}