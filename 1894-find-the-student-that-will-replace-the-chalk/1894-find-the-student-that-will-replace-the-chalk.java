class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long accountSum = 0;
        for (int ch : chalk) accountSum += ch;

        k %= accountSum;

        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) return i;
            k -= chalk[i];
        }
        return -1; 
    }
}