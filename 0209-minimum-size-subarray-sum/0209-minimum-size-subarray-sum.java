class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int l=0;
        int r=0;
        int sum= 0;
        int ans= Integer.MAX_VALUE;
        int currLen= 0;
        while(r < n){ 
            sum+= nums[r];
            while(sum >= target){ 
                currLen= r - l + 1;
                ans= Math.min(ans, currLen);
                sum-= nums[l];
                l++; 
            }
            r++;   
        }
        return ans == Integer.MAX_VALUE ? 0 : ans; 
    }
}