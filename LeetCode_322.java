public class LeetCode_322 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            for (int i = 1; i <= amount; i++)
                dp[i] = 0x3f3f3f;

            for (int i = 0; i < coins.length; i++)
                for (int j = coins[i]; j <= amount; j++)
                    dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);

            return dp[amount] == 0x3f3f3f ? -1 : dp[amount];
        }
    }
}
