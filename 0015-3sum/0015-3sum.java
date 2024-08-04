class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
                int x = (nums[a] + nums[b]) * -1;
                if(binary(nums, a, b, x)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[a]);
                        temp.add(nums[b]); 
                        temp.add(x);
                        Collections.sort(temp);
                        list.add(temp);                    
                }
            }
        }
        return new ArrayList<List<Integer>> (list);
    }
    boolean binary(int[] nums, int a, int b, int x){
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == x && mid != a && mid != b) return true;
            else if(nums[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return false;  
    }
}