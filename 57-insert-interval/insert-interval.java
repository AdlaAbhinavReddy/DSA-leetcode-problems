class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length +1;
        int[][] finalInterval = new int[n][2];
        int[][] ans = new int[n][2];
        int i, index = 0;
        for (i = 0; i < intervals.length; i++) {
            finalInterval[i] = intervals[i];
        }
        finalInterval[i] = newInterval;
        Arrays.sort(finalInterval,(a, b) -> Integer.compare(a[0], b[0]));
        for (i = 0; i < n; i++) {
            if (index == 0 || ans[index - 1][1] < finalInterval[i][0]) {
                ans[index][0] = finalInterval[i][0];
                ans[index][1] = finalInterval[i][1];
                index++;
            } else {
                int max_val = Math.max(ans[index - 1][1], finalInterval[i][1]);
                ans[index-1][1] = max_val;
            }
        }
        return Arrays.copyOf(ans, index);
    }
}