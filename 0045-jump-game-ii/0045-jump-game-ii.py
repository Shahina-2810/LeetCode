class Solution:
    def jump(self, nums: List[int]) -> int:
        mx,count,curr=0,0,0
        for i in range(len(nums)-1):
            if i+nums[i]>mx: mx=i+nums[i]
            if i==curr: curr,count=mx,count+1 
        return count 