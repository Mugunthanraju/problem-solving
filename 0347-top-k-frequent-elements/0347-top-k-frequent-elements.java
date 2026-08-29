class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int num : nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    // Buckets = [ 0=[], 1=[], 2=[], ...] & here 0, 1, 2 are frequencies 
    List<Integer>[] buckets = new List[nums.length + 1];

    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
      int num = entry.getKey();
      int freq = entry.getValue();

      if (buckets[freq] == null)
        buckets[freq] = new ArrayList<>();

      buckets[freq].add(num);
    }

    int[] ans = new int[k];
    int idx = 0;

    for (int freq = buckets.length - 1; freq > 0 && idx < k; freq--) {
      if (buckets[freq] == null)
        continue;

      for (int num : buckets[freq]) {
        ans[idx++] = num;

        if (idx == k)
          return ans;
      }
    }
    return ans;
  }
}