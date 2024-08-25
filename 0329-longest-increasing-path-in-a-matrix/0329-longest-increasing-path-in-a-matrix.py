class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        row = len(matrix)
        col = len(matrix[-1])
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

        @lru_cache(maxsize = None)
        def dfs(r, c):
            max_len = 1

            for d_r, d_c in directions:
                dr, dc = r + d_r, c + d_c

                if dr > -1 and dr < row and dc > -1 and dc < col and matrix[dr][dc] > matrix[r][c]:
                    max_len = max(max_len, 1 + dfs(dr, dc))
            
            return max_len
        
        maxi = 0
        for i in range(row):
            for j in range(col):

                maxi = max(maxi, dfs(i, j))
        
        return maxi