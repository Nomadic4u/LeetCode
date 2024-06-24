public class LeetCode_238 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int pre = 1;
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = pre;
                pre *= nums[i];
            }

            int last = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                ans[i] *= last;
                last *= nums[i];
            }

            return ans;
        }
    }
}
