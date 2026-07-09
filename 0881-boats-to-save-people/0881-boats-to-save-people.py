class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        boat = left = 0
        right = len(people) - 1
        people.sort()

        while left <= right:
          total = people[right] + people[left]
          if total <= limit:
            left += 1
            right -= 1
            boat += 1
          else: 
            right -= 1
            boat += 1
        
        return boat