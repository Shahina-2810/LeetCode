class Solution:
    def isMatch(self, s: str, p: str) -> bool:
         string = {}
    
         def dp(i: int, j: int) -> bool:
            if (i, j) in string:
                return string[(i, j)]
        
            if j == len(p):
                return i == len(s)
        
            found = i < len(s) and (p[j] == s[i] or p[j] == '.')
        
            if j + 1 < len(p) and p[j+1] == '*':
                ans = dp(i, j+2) or (found and dp(i+1, j))
            else:
                ans = found and dp(i+1, j+1)
        
            string[(i, j)] = ans
            return ans
    
         return dp(0, 0)
        