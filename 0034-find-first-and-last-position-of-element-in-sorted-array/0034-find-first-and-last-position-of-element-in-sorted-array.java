class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        int left=BinarySearch(nums,target,true);
        int right=BinarySearch(nums,target,false);
        result[0]=left;
        result[1]=right;
        return result;
    }
    private int BinarySearch(int[] nums, int target, boolean isSearch){
        int left=0;
        int right=nums.length-1;
        int index=-1;
        
        while(left<=right){
               int mid=left+(-left+right)/2;
            
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                index=mid;
                if(isSearch){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return index;
    }
}