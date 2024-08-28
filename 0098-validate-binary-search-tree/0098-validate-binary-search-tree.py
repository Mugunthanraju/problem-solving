# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        minVal = -1000000000000
        maxVal = 1000000000000
        
        def findit(root, minVal,  maxVal):
            if root is None:
                return True

            if minVal >= root.val or maxVal <= root.val:
                return False
            
            return findit(root.left, minVal, root.val) and findit(root.right, root.val, maxVal)
        
        return findit(root, minVal, maxVal)
            