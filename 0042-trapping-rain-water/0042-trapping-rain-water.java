class Solution {
    public int trap(int[] height) {
         int water=0;
        int lmax=0, rmax=0, left=0, right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                if(lmax>height[left]) water+=lmax-height[left];
                else lmax=height[left];
                left++;
            }else{
                if(rmax>height[right]) water+=rmax-height[right];
                else rmax=height[right];
                right--;
            }
        }
        return water;
    }
}