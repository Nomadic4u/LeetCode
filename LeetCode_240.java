public class LeetCode_240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int x = 0, y = matrix[0].length - 1;
            while (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
                if (target == matrix[x][y])
                    return true;
                else if (target < matrix[x][y])
                    y--;
                else
                    x++;
            }
            return false;
        }
    }
}
