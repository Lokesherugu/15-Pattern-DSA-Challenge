import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse intervals
        for (int[] interval : intervals) {
            // If list is empty or no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlap → merge by updating the end
                merged.get(merged.size() - 1)[1] = Math.max(
                    merged.get(merged.size() - 1)[1],
                    interval[1]
                );
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
