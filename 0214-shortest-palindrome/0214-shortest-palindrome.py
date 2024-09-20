class Solution(object):
    def shortestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        String_rev = s[::-1]
        combined= s + "#" + String_rev
        lps= [0]* len(combined)
        
        for i in range(1,len(combined)):
            j=lps[i-1]
            while j>0 and combined[i]!=combined[j]:
                j=lps[j-1]
            if combined[i]==combined[j]:
                j+=1
            lps[i]=j
        palindrome_Length=lps[-1]
        return String_rev[:len(s)-palindrome_Length]+s
        