class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # direction = [(0, 1), (1, 0)]

        def findPath(m, n, p = dict()):
            if m == 1 and n == 1:
                return 1
            if m == 0 or n == 0:
                return 0
            if (m, n) in p:
                return p[(m, n)]
            p[(m, n)] = findPath(m , n - 1, p) + findPath(m - 1, n, p)
            return p[(m, n)]
        
        return findPath(m, n)
        

