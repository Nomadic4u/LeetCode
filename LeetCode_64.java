public class LeetCode_64 {
    class Solution {
        public int minPathSum(int[][] grid) {
            int[][] res = new int[grid.length][grid[0].length];
            res[0][0] = grid[0][0];
            for (int i = 1; i < grid[0].length; i++)
                res[0][i] = grid[0][i] + res[0][i - 1];

            for (int i = 1; i < grid.length; i++)
                res[i][0] = grid[i][0] + res[i - 1][0];

            for (int i = 1; i < grid.length; i++)
                for (int j = 1; j < grid[0].length; j++)
                    res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];

            return res[grid.length - 1][grid[0].length - 1];
        }
    }
}
