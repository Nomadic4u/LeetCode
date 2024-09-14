public class LeetCode_560_3 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length; i ++) {
                int res = 0;
                for (int j = i; j < nums.length; j ++) {
                    res += nums[j];
                    if(res == k)
                        count ++;
                }

            }

            return count;
        }
    }
}
