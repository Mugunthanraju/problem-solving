class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []

        for asteroid in asteroids:

            while stack and stack[-1] > 0 and asteroid < 0:
                difference = stack[-1] + asteroid
                if difference >= 0:
                    asteroid = 0
                if difference <= 0:
                    stack.pop()

            if asteroid:
                stack.append(asteroid)
                
        return stack