import java.util.HashSet;
import java.util.Set;

public class LeetCode_209 {
    // 利用一个滑动窗口, 如果当前窗口的总和小于target, 则right往后移动, 反之则left向后移动, 同时记录len
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0, right = 0, len = Integer.MAX_VALUE, sum = 0;
            Set<Integer> set = new HashSet<>();
            set.
            for (right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    len = Math.min(len, right - left + 1);
                    sum -= nums[left++];
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;
        }
    }
}
