class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minValue = arrays.get(0).get(0);
        int maxValue = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);

            // Calculate distance using current min and max with other arrays
            maxDistance = Math.max(maxDistance, Math.max(
                Math.abs(currentArray.get(currentArray.size() - 1) - minValue),
                Math.abs(maxValue - currentArray.get(0))
            ));

            // Update the global min and max values
            minValue = Math.min(minValue, currentArray.get(0));
            maxValue = Math.max(maxValue, currentArray.get(currentArray.size() - 1));
        }

        return maxDistance;
    }
}