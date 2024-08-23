class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
       int mx=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>mx){
                mx=nums[i];
            }
        }
       List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]+e>=mx){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans; 
    }
}