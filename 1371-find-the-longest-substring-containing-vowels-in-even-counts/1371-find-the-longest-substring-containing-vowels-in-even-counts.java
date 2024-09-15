class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int cnt = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                cnt ^= (1 << ((int)(s.charAt(i) - 'a')));
            }
            if (map.containsKey(cnt)) {
                ans = Math.max(ans, i - map.get(cnt));
            } else {
                map.put(cnt, i);
            }
        }
        return ans;
    }
}