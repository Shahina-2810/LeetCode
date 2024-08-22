class Solution {
    public int findComplement(int num) {
        String bina=Integer.toBinaryString(num);
        String str="";
        for(int i=0;i<bina.length();i++){
            if(bina.charAt(i)=='0'){
                str+='1';
            }
            else{
                str+='0';
            }
        }
        return Integer.parseInt(str,2);
    }
}