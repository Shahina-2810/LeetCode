class Solution:
    def myAtoi(self, s: str) -> int:
        imax = (2**31) - 1
        imin = -1 * (2**31)
        num = 0
        l = len(s)
        i = 0
        sign = 1

        while i < l and s[i] == ' ':
            i += 1

        if i < l and (s[i] == '+' or s[i] == '-'):
            sign = -1 if s[i] == '-' else 1
            i += 1

        while i < l and ord(s[i]) >= ord('0') and ord(s[i]) <= ord('9'):
            num = num * 10 + int(s[i])
            i += 1

        num *= sign
        
        return min(max(num, imin), imax)
        