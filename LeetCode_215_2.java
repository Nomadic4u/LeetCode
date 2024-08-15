public class LeetCode_215_2 {
    // 快排
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            quick_sort(nums, 0, nums.length - 1);
            for (int num : nums) {
                System.out.println("nums: " + num);
            }
            return nums[k - 1];
        }

        public void quick_sort(int[] nums, int left, int right) {
            if (left == right)
                return;
            int l = left - 1;
            int r = right + 1;
            int mid = (left + right) / 2;
            int x = nums[mid];
            while (l < r) {
                do {
                    l++;
                } while (nums[l] > x);
                do {
                    r--;
                } while (nums[r] < x);
                if (l < r) {
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                }
            }
            quick_sort(nums, left, r);
            quick_sort(nums, r + 1, right);
        }
    }
}
