public class LeetCode_1035 {
    class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            int res = 0;
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j])
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                    else
                        dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                    res = Math.max(res, dp[i + 1][j + 1]);
                }
            }
            return res;
        }
    }
}
