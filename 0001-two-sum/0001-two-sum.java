class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            We store each number and its index in HashMap
            Iterate through the array, check if the complement (target - current number) is already in the map
        */

        // Define HashMap
        Map<Integer, Integer> numMap = new HashMap<>();
        // Define other required variables
        int index, complement;

        // Interate through array
        for (index = 0; index < nums.length; index++) {
            // find differences
            complement = target - nums[index];

            // Check diff in Map, if there is then return indeces
            if (numMap.containsKey(complement))
                return new int[] {numMap.get(complement), index};
            else 
                // put curr number and index in map as a key-value
                numMap.put(nums[index], index);
        }

        return new int[2];

    }
}