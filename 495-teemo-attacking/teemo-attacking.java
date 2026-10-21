class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int totime = timeSeries.length * duration;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration > timeSeries[i + 1]) {
                total += timeSeries[i] + duration - timeSeries[i + 1];
            }
        }

        return totime - total;
    }
}