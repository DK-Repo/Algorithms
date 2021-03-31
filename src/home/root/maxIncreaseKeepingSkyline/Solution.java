package home.root.maxIncreaseKeepingSkyline;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.length;

        int[] maxRowVals = new int[n];
        int[] maxColumnVals = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRowVals[i] = Math.max(maxRowVals[i], grid[i][j]);
                maxColumnVals[j] = Math.max(maxColumnVals[j], grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.min(maxRowVals[i], maxColumnVals[j]) - grid[i][j];
            }
        }
        return result;
    }
}
