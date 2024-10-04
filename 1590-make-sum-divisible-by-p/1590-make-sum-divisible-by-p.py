class Solution:
    def minSubarray(self, nums: List[int], p: int) -> int:
        n=len(nums)
        modP=sum(nums)%p
        if modP==0:  # if total sum is divisible by p
            return 0
        
        pos={0: -1}  # track prefix sum and its index
        sumP, Len = 0, n
        
        for i, x in enumerate(nums):
            sumP=(sumP+x) % p
            y=(sumP-modP+p) % p  # find the necessary prefix to remove
            if y in pos:
                Len=min(Len, i-pos[y])
            pos[sumP]=i  # update pos
        
        return -1 if Len == n else Len