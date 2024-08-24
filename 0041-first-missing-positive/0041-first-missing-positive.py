class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        return next(p+1 for p,q in pairwise(sorted(nums+[0,inf])) if p>=0<q-p-1)
