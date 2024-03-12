public class LeetCode_200 {
    class Solution {
        public int numIslands(char[][] grid) {
            int res = 0;
            int index = 1;
            int[][] visited = new int[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1' && visited[i][j] == 0) {
                        dfs(grid, visited, i, j, index ++);
                        res = Math.max(res, visited[i][j]);
                    }
                }
            }
            return res;

        }

        public void dfs(char[][] grid, int[][] visited, int i, int j, int index) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || visited[i][j] != 0) {
                return;
            }

            visited[i][j] = index;
            dfs(grid, visited, i + 1, j, index);
            dfs(grid, visited, i - 1, j, index);
            dfs(grid, visited, i, j + 1, index);
            dfs(grid, visited, i, j - 1, index);
        }

    }
}
