class Solution {
    public int longestSubarray(int[] nums) {
     int max_Val = nums[0];
        int max_Len = 1;
        int current_Len = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max_Val) {
                max_Val = nums[i];
                max_Len = 1;
                current_Len = 1;
            } else if (nums[i] == max_Val) {
                current_Len++;
                max_Len = Math.max(max_Len, current_Len);
            } else {
                current_Len = 0;
            }
        }

        return max_Len;
    
    }
}