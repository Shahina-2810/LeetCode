
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[256]; // Array to store the last index of each character
        for (int i = 0; i < 256; i++) {
            charIndex[i] = -1; // Initialize array with -1
        }
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1;
            }
            charIndex[currentChar] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1));  // Output: 3
        System.out.println(lengthOfLongestSubstring(s2));  // Output: 1
        System.out.println(lengthOfLongestSubstring(s3));  // Output: 3

        
        
    
    }
}