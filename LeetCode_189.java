public class LeetCode_189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            int len = nums.length;
            k = k % len;
            int[] count = new int[k];
            for (int i = len - k, index = 0; i < len; i++) {
                count[index++] = nums[i];
            }
            for (int i = len - k - 1; i >= 0; i--) {
                nums[i + k] = nums[i];
            }
            for (int i = 0; i < k; i++) {
                nums[i] = count[i]; // 这里不能用nums[len - k + i]
            }
        }
    }
}
