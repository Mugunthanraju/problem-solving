class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0, left = 0, right = people.length - 1;
        
        Arrays.sort(people); // To get right combination of weigth 

        while (left <= right) {
            
            if (limit >= people[left] + people[right]) {
                // Maximum of two people
                boat++;
                left++;
                right--;
            }
            else {
                // Minimum of one person
                boat++;
                right--;
            }
        }
        return boat; // the minimum number of boats to carry every given person

    }
}