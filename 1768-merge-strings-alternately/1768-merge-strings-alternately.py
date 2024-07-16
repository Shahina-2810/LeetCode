class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
    
        res = []
        min_len = min(len(word1), len(word2))
        
        for i in range(min_len):
            res.append(word1[i])
            res.append(word2[i])
        
        res.extend(word1[min_len:])
        res.extend(word2[min_len:])
        return ''.join(res)
        