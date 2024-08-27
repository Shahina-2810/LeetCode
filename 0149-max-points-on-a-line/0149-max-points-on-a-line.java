class Solution {
    public int maxPoints(int[][] points) {
       if (points.length == 0) return 0;
        
        int maxCount = 0;
        
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopes = new HashMap<>();
            int duplicate = 1;
            
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    duplicate++;
                } else {
                    int dx = points[j][0] - points[i][0];
                    int dy = points[j][1] - points[i][1];
                    String slope = getSlope(dx, dy);
                    slopes.put(slope, slopes.getOrDefault(slope, 0) + 1);
                }
            }
            
            int localMax = duplicate;
            for (int count : slopes.values()) {
                localMax = Math.max(localMax, count + duplicate);
            }
            maxCount = Math.max(maxCount, localMax);
        }
        
        return maxCount;
    }
    
    private String getSlope(int dx, int dy) {
        if (dx == 0) return "inf";
        if (dy == 0) return "0";
        
        int gcd = gcd(dx, dy);
        dx /= gcd;
        dy /= gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        
        return dy + "/" + dx;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;   
    }
}