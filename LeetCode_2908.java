public class LeetCode_2908 {
    class Solution {
        public int minimumSum(int[] nums) {
            int len = nums.length;
            if (len < 2)
                return -1;
            int sum = 0x3f3f3f;
            for (int i = 1; i < len - 1; i++) {
                for(int j = i - 1; j >= 0; j --) {
                    for(int k = i + 1; k < len; k ++) {
                        if(nums[i] > nums[j] && nums[i] > nums[k]) {
                            int count = nums[i] + nums[j] + nums[k];
                            sum = Math.min(sum, count);
                        }
                    }

                }
            }
            return sum == 0x3f3f3f ? -1 : sum;
        }
    }
}
