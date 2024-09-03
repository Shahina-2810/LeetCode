class Solution:
    def getLucky(self, s: str, k: int) -> int:
        num1=0
        for c in s:
            x=ord(c)-96
            q,r =divmod(x, 10)
            num1+=q+r
        k-=1
        x=num1
        for _ in range(k, 0, -1):
            num1=0
            while x>0:
                q,r =divmod(x, 10)
                num1+=r
                x=q
            x=num1
            if x<10:break
        return num1