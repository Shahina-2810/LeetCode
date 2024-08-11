class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if divisor<0 and dividend<0:
            if dividend!=-1 and divisor==-1:
                return (dividend//divisor)-1
            return (dividend//divisor)
        elif divisor>0 and dividend>0:
            return (dividend//divisor)
        else:
            res=abs(dividend)//abs(divisor)
            return -res
        