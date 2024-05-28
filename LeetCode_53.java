/**
 * DP
 */
public class LeetCode_53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int[] sum = new int[nums.length];
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(sum[i - 1] > 0)
                    sum[i] = sum[i - 1] + nums[i];
                else
                    sum[i] = nums[i];
            }
            int res = Integer.MIN_VALUE;
            for (int count : sum)
                res = Math.max(res, count);
            return res;
        }
    }
}
