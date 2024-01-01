public class LeetCode_1671 {
    class Solution {
        public int minimumMountainRemovals(int[] nums) {
            int[] dp_right = new int[nums.length];
            int[] dp_left = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                dp_right[i] = 1;
                for (int j = 0; j < nums.length; j++) {
                    if(nums[i] > nums[j]) {
                        dp_right[i] = Math.max(dp_right[i], dp_right[j] + 1);
                    }
                }
            }

            for (int i = nums.length - 1; i >= 0; i --) {
                dp_left[i] = 1;
                for (int j = nums.length - 1; j >= 0; j --) {
                    if(nums[i] > nums[j]) {
                        dp_left[i] = Math.max(dp_left[i], dp_left[j] + 1);
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if(dp_right[i] > 1 && dp_left[i] > 1)
                    ans = Math.max(ans, dp_left[i] + dp_right[i] - 1);
            }
            return nums.length - ans;
        }
    }
}
