class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        if (slow == 1)
            return true;
        
        return false;
    }

    public int square(int number) {
        int result = 0, remainder;

        while (number > 0) {
            remainder = number % 10;
            result += (remainder * remainder);
            number /= 10;
        }
        
        return result;
    }
}