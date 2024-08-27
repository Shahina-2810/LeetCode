class Solution:
    def numDecodings(self, s: str) -> int:
        if(s[0]=="0"):
            return 0
        l=[1,1]+([0,]*(len(s)-1))
        for i in range(1,len(s)):
            if((int(s[i])>=1)and(int(s[i])<=9)):
                l[i+1]+=l[i]
            if((int(s[i-1]+s[i])>=10)and(int(s[i-1]+s[i])<=26)):
                l[i+1]+=l[i-1]
        return l[-1]