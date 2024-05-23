public class LeetCode_283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums.length == 1)
                return;
            int left = 0, right = 1;
            while (right < nums.length) {
                while (nums[right] == 0)
                    right++;
                if (right >= nums.length)
                    break;
                if (nums[left] == 0 && nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                right++;
                left++;
            }
        }
    }
}
