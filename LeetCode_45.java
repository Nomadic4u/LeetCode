public class LeetCode_45 {
    class Solution {
        public int jump(int[] nums) {
            boolean[] str = new boolean[nums.length];
            int[] res = new int[nums.length];
            str[0] = true;
            for (int i = 0; i < nums.length && str[i]; i++) {
                for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                    if (str[i + j])
                        continue;
                    str[i + j] = true;
                    res[i + j] = res[i] + 1;
                    if (i + j == nums.length - 1)
                        return res[i + j];
                }
            }
            return res[nums.length - 1];
        }
    }
}
