/**
 *
 */
public class LeetCode_53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums.length == 1) {
                return nums[0];
            }
            int res = 0;
            int[] sum = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                res += nums[i];
            }
            sum[nums.length - 1] = res;
            for (int i = nums.length - 2; i >= 0; i--) {
                res -= nums[i + 1];
                sum[i] = res;
                System.out.println(sum[i]);
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, sum[i]);
                min = Math.min(min, sum[i]);
            }

            return Math.max(max - min, max);
        }
    }
}
