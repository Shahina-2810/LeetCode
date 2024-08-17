class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for(int i=n-1; i>0; i--){
            int temp = first;
            first = first + second;
            second = temp;
        }
        return first;
    }
}