class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])

        left, right = 0, row*col - 1

        while left < right:
            mid = (left + right) >> 1
            if matrix[mid // col][mid % col] >= target:
                right = mid
            else:
                left = mid + 1
        return matrix[right // col][right % col] == target