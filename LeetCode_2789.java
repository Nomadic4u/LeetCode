public class LeetCode_2789 {
    /**
     * 利用贪心的思想 从后往前遍历
     */
    class Solution {
        public long maxArrayValue(int[] nums) {
            long res = nums[nums.length - 1];
            int len = nums.length;
            while (len > 0) {
                if (res >= nums[len - 1])
                    res += nums[len - 1];
                else
                    res = nums[len - 1];
                len--;
            }
            return res;
        }
    }
}
