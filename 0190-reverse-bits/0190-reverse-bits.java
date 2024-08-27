class Solution:
    def reverseBits(self, n: int) -> int:
        reversed_num = 0
        for i in range(32):
            # Get the last bit of n and add it to reversed_num
            reversed_num = (reversed_num << 1) | (n & 1)
            # Shift n right by 1 to process the next bit
            n >>= 1
        return reversed_num