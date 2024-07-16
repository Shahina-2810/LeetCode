class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        num=nums1+nums2
        num=sorted(num)
        l=len(num)
        if l % 2==0:
            return  (num[int(l/2)-1] + num[int(l/2)]) / 2
        return num[int(l/2)]
        