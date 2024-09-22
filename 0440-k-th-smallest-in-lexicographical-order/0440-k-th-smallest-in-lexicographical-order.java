class Solution {
    public int findKthNumber(int n, int k) {
        int current_Prefix = 1;
        k--;  // Decrement k to handle zero-based indexing
        
        while (k > 0) {
            int count = count_Numbers_With_Prefix(current_Prefix, n);
            if (k >= count) {
                current_Prefix++;  // Move to the next prefix
                k -= count;
            } else {
                current_Prefix *= 10;  // Go deeper in the current prefix
                k--;
            }
        }
        
        return current_Prefix;
    }

    private int count_Numbers_With_Prefix(int prefix, int n) {
        long first_Number = prefix, next_Number = prefix + 1;
        int totalCount = 0;

        while (first_Number <= n) {
            totalCount += Math.min(n + 1, next_Number) - first_Number;
            first_Number *= 10;
            next_Number *= 10;
        }

        return totalCount;
    }
}