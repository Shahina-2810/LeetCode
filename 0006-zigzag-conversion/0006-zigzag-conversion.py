class Solution:
    def convert(self, s: str, numRows: int) -> str:
         if numRows <= 1 or len(s) <= numRows:
            return s

         rows = [''] * min(numRows, len(s))
         i = 0
         way = 1

         for char in s:
             rows[i] += char
             if i == 0:
                  way = 1
             elif i == numRows - 1:
                  way = -1
             i += way
 
         return ''.join(rows)
 
        