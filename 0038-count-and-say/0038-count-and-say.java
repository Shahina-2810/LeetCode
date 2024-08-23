class Solution {
    public String countAndSay(int n) {
         if (n == 1) return "1";  // Base case

        String result = "1";  // Starting point for n = 1

        for (int i = 2; i <= n; i++) {
            result = getNext(result);
        }

        return result;
    }

    private static String getNext(String term) {
        StringBuilder nextTerm = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < term.length(); i++) {
            if (term.charAt(i) == term.charAt(i - 1)) {
                count++;
            } else {
                nextTerm.append(count);
                nextTerm.append(term.charAt(i - 1));
                count = 1;
            }
        }
        
        // Append the count and digit for the last sequence
        nextTerm.append(count);
        nextTerm.append(term.charAt(term.length() - 1));
        
        return nextTerm.toString();
    
    }
}