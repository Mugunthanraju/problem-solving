class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        boat, left, right = 0, 0, len(people) - 1
        people.sort()

        while left <= right:
          if people[right] + people[left] <= limit:
            left += 1
          right -= 1
          boat += 1
        
        return boat