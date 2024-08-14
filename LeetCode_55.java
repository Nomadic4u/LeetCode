public class LeetCode_55 {
    class Solution {
        public boolean canJump(int[] nums) {
            int max_num = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > max_num)
                    return false;
                max_num = Math.max(max_num, i + nums[i]);
            }
            return true;
        }
    }
}
