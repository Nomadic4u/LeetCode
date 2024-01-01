public class LeetCode_1901 {
    class Solution {
        public int[] findPeakGrid(int[][] mat) {
            int m = mat.length, n = mat[0].length;
            int left = 0, right = m - 1;
            while(left <= right) {
                int mid  =  (left + right) / 2;
                int max_index = -1, max_num = -1;
                for (int i = 0; i < n; i++) {
                    if(mat[mid][i] > max_num) {
                        max_index = i;
                        max_num = mat[mid][i];
                    }
                }
                if(mid - 1 >= 0 && mat[mid][max_index] < mat[mid - 1][max_index]) {
                    right = mid - 1;
                    continue;
                }
                if(mid + 1 < m && mat[mid][max_index] < mat[mid + 1][max_index]) {
                    left = mid + 1;
                    continue;
                }
                return new int[]{mid, max_index};
            }
            return new int[]{0, 0};
        }
    }
}
