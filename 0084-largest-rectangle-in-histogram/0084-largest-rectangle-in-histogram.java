class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int element=i==n?0: heights[i];
            while(!st.isEmpty()&&heights[st.peek()]>element){
                int h=heights[st.pop()];
                int ps=st.isEmpty()? -1:st.peek();
                int w=i-ps-1;
                max=Math.max(max,h*w);
            }st.push(i);
        }return max==Integer.MIN_VALUE?0:max;
    }
}