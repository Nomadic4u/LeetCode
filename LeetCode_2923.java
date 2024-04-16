public class LeetCode_2923 {
    class Solution {
        public int findChampion(int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                int cnt = 0;
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[j][i] == 1)
                        cnt = 1;
                }
                if (cnt == 0)
                    return i;
            }
            return -1;
        }
    }
}
