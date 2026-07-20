import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort according to starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> answer = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // Overlapping intervals
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }

            // Not overlapping
            else {
                answer.add(new int[]{start, end});

                start = currentStart;
                end = currentEnd;
            }
        }

        // Add the final interval
        answer.add(new int[]{start, end});

        // Convert List into 2D array
        int[][] result = new int[answer.size()][2];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}