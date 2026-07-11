class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:

      return list(set(nums1) & set(nums2))

      # intersections = set()

      # nums1.sort()
      # nums2.sort()

      # i = j = 0

      # while( i < len(nums1) and j < len(nums2) ):
      #   if nums1[i] > nums2[j]:
      #     j += 1
      #   elif nums1[i] < nums2[j]:
      #     i += 1
      #   else:
      #     intersections.add(nums1[i])
      #     i += 1
      #     j += 1
      
      # return list(intersections)

        

        