class Solution {
    public String reverseVowels(String s) {
         StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'||ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'){
                     sb.setCharAt(i,ch2);
                     sb.setCharAt(j,ch1);
                     i++;
                }
                j--;
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}