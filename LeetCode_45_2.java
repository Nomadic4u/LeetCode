public class LeetCode_45_2 {
    class Solution {
        public int jump(int[] nums) {
            int now_max = 0;
            int total_max = 0;
            int step = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                total_max = Math.max(total_max, i + nums[i]);
                if (i == now_max) {
                    now_max = total_max;
                    step++;
                }
            }
            return step;
        }
    }
}
