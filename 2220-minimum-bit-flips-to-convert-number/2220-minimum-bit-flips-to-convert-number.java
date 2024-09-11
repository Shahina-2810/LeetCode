class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0; 
        int XOR = start ^ goal; // XOR will give 1 where the bits differ

        while(XOR!=0){
            count += XOR & 1; // Increment count if the last bit is 1
            XOR >>=1; // Right-shift to check the next bit
        }
        return count;  
    }
}