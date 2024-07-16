class Solution:
    def reverse(self, x: int) -> int:
        imax = 2**31 - 1
        imin = -2**31
        
        if x < 0:
            rev_x = -int(str(-x)[::-1])
        else:
            rev_x = int(str(x)[::-1])
        
        if rev_x < imin or rev_x > imax:
            return 0
        
        return rev_x
