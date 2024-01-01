public class LeetCode_746 {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp1 = new int[cost.length + 1];
            int[] dp2 = new int[cost.length + 1];
            dp1[2] = cost[0];
            dp2[2] = cost[1];
            for (int i = 3; i <= cost.length; i++) {
                dp1[i] = Math.min(dp1[i - 2] + cost[i - 2], dp1[i - 1] + cost[i - 1]);
            }
            for (int i = 3; i <= cost.length; i++) {
                dp2[i] = Math.min(dp2[i - 2] + cost[i - 2], dp2[i - 1] + cost[i - 1]);
            }
            return Math.min(dp1[cost.length], dp2[cost.length]);
        }

    }
}
