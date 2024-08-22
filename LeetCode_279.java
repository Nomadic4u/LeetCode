public class LeetCode_279 {
    class Solution {
        public int numSquares(int n) {
            int[] nums = new int[101];
            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++)
                dp[i] = 0x3f3f3f;

            for (int i = 1; i <= 100; i ++)
                nums[i] = i * i;

            for(int i = 1; i <= 100; i ++)
                for (int j = nums[i]; j <= n; j ++)
                    dp[j] = Math.min(dp[j], dp[j - nums[i]] + 1);

            return dp[n];
        }
    }
}
