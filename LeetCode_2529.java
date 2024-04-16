import java.util.Arrays;

public class LeetCode_2529 {
    class Solution {
        public int maximumCount(int[] nums) {
            return func(nums);
        }

        // 二分函数
        public int func(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = (right + left) / 2;
                if (nums[mid] < 0) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left);

            int num1 = left + 1;
            if (nums[num1] == 0)
                num1--;
            while (left < nums.length && nums[left] <= 0)
                left++;
            int num2 = nums.length - left;
            return Math.max(num1, num2);
        }
    }
}
