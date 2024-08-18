class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to find the GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}