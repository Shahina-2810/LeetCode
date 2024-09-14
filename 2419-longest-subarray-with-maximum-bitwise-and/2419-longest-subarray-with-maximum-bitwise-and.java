class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int longestLength = 0;
        int currentLength = 0;

        // Step 1: Find the maximum value in the array
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        // Step 2: Find the longest subarray where all elements equal the maxVal
        for (int num : nums) {
            if (num == maxVal) {
                currentLength++;  // Increase length of the current subarray
                longestLength = Math.max(longestLength, currentLength);  // Update longest length
            } else {
                currentLength = 0;  // Reset the current length when the value is different
            }
        }

        return longestLength;
    
    }
}