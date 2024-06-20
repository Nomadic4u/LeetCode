public class LeetCode_74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int low = 0, high = matrix.length - 1;
            while (low < high) {
                int h_mid = (high + low) / 2;
                if (matrix[h_mid][0] >= target)
                    high = h_mid;
                else
                    low = h_mid + 1;
            }

            if (low != 0 && matrix[low][0] > target)
                low--;
            int left = 0, right = matrix[0].length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (matrix[low][mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }

            return matrix[low][left] == target ? true : false;
        }
    }
}
