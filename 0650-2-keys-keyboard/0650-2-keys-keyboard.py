class Solution:
    def minSteps(self, n: int) -> int:
        factor=2
        steps=0
        
        if n==1:
            return 0
        
        while n>1:
            while n%factor==0:
                steps += factor
                n //= factor
            factor += 1
            
        return steps