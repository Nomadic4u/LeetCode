public class LeetCode_128 {
    /**
     * 暴力解法, 用桶排序, 空间换时间, 但大概率会爆
     */
    class Solution {
        public int longestConsecutive(int[] nums) {
            int max_number = 0, len = 0;
            for (int i = 0; i < nums.length; i++) {
                max_number = Math.max(max_number, nums[i]);
            }
            int[] bucket = new int[max_number * 2 + 10];
            for (int i = 0; i < nums.length; i++) {
                bucket[nums[i] + max_number] = 1;
            }
            int index = 0;
            for (int i = 0; i < max_number * 2 + 10; i++) {
                if (bucket[i] == 1) {
                    index++;
                } else {
                    index = 0;
                }
                len = Math.max(len, index);

            }
            return len;
        }
    }
}
