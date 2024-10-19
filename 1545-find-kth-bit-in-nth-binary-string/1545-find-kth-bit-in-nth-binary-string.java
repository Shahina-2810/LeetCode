class Solution {
    public char findKthBit(int n, int k) {
        if(n==1) return '0';
        if(k<(1<<n)/2)
            return findKthBit(n-1,k);
        if(k==(1<<n)/2)
            return '1';
        else
            return (findKthBit(n-1,(1<<n)-k) == '0') ? '1' : '0';
    }
}