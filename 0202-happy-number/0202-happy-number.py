class Solution:
    def isHappy(self, n: int) -> bool:
      
        def sum_of_squares(num):
            result = 0

            while num > 0:
                remainder = num % 10
                result += remainder ** 2
                num //= 10

            return result

        slow = fast = n

        while True:
            slow = sum_of_squares(slow)
            fast = sum_of_squares(sum_of_squares(fast))

            if slow == fast:
                break

        return slow == 1
