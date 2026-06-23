class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            We store each number and its index in HashMap
            Iterate through the array, check if the complement (target - current number) is already in the map
        */

        // Define HashMap
        Map<Integer, Integer> complementIndex = new HashMap<>();
        // Define other required variables
        int index, diff;

        // Interate through array
        for (index = 0; index < nums.length; index++) {
            // find differences
            diff = target - nums[index];

            // Check diff in Map, if there is then return indeces
            if (complementIndex.containsKey(diff))
                return new int[] {complementIndex.get(diff), index};
            else 
                // put curr number and index in map as a key-value
                complementIndex.put(nums[index], index);
        }

        return new int[2];

    }
}