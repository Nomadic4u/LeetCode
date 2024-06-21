public class LeetCode_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums.length == 0)
                return new int[]{-1, -1};
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }
            if (nums[left] != target)
                return new int[]{-1, -1};
            else {
                int now_left = 0, now_right = nums.length - 1;
                while (now_left < now_right) {
                    int now_mid = (now_left + now_right + 1) / 2;
                    if (nums[now_mid] <= target)
                        now_left = now_mid;
                    else
                        now_right = now_mid - 1;
                }
                return new int[]{left, now_left};
            }
        }
    }
}
