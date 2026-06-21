class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> unique = new HashMap<>();
        int i;
        for(i = 0; i < nums.length; i++) {
            if (unique.containsKey(nums[i])) {
                // System.out.println(unique.get(nums[i]) + " : " + i);
                if (Math.abs(unique.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    unique.put(nums[i], i);
                }
            } else {
                unique.put(nums[i], i);
            }
        }
        System.gc();
        return false;
    }
}