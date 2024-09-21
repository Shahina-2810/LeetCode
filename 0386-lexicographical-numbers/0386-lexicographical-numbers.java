class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> all = new  ArrayList<>();
        int current = 1; 
        for(int i=1; i<=n; i++)
        {
          all.add(current);
          if(current*10<=n)
          current = current*10;
          else
          {
            while(current%10==9 || current>=n)
            {
              current = current/10;   
            } 
            current += 1;
          }
        } 
        return all;
    }
}