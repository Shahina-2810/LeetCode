class Solution:
    def longestPalindrome(self, s: str) -> str:
        if s == s[::-1]: return s
        l= len(s)-1
        cLeft, cRght = 0, 0
        pal = s[0]

        while cRght < l:
            while cRght < l:
                if s[cRght] != s[cRght + 1]: break
                cRght = cRght + 1
            i, j = cLeft, cRght

            while i > 0 and j < l:
                if s[i - 1] != s[j + 1]: break
                i -= 1
                j += 1

            if len(pal) < j + 1 - i:
                pal = s[i:j+1]
                
            cRght = cRght +1
            cLeft = cRght
        return pal
        