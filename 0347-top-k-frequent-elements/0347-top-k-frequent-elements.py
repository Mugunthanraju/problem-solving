class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
      # from collections import Counter
      # freq = Counter(nums)
      # buckets = [[] for _ in range(len(nums) + 1)]

      # for x, f in freq.items():
      #     buckets[f].append(x)

      # ans = []
      # for f in range(len(buckets) - 1, 0, -1):
      #     ans.extend(buckets[f])
      #     if len(ans) >= k:
      #         return ans[:k]
      return [x[0] for x in Counter(nums).most_common(k)]