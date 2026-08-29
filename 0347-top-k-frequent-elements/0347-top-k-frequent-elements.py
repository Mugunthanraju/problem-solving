class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
      
      # return [x[0] for x in Counter(nums).most_common(k)]

      from collections import Counter
      freq_dict = Counter(nums)
      buckets = [[] for _ in range(len(nums) + 1)]

      for element, freq in freq_dict.items():
          buckets[freq].append(element)

      ans = []
      for freq in range(len(buckets) - 1, 0, -1):
          ans.extend(buckets[freq])
          if len(ans) >= k:
              return ans[:k]