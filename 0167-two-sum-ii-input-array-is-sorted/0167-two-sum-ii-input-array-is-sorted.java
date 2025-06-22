class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = {-1, -1};

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (target > sum)
                left++;
            else if (target < sum)
                right--;
            else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;
    }
}