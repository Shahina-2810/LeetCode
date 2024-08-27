class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        # Reverse the list of words
        reversed_words = words[::-1]
        # Join the reversed words with a single space
        reversed_string = ' '.join(reversed_words)
        return reversed_string