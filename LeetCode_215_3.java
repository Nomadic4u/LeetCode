public class LeetCode_215_3 {
    // 堆排序(大根堆)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            heap_sort(nums);
            for (int num : nums) {
                System.out.println("num: " + num);
            }
            for (int i = 0; i < k - 1; i++) {
                nums[0] = nums[nums.length - i - 1];
                down(nums, 0, nums.length - i - 2);
            }
            return nums[0];
        }

        public void heap_sort(int[] nums) {
            for (int i = nums.length / 2; i >= 0; i--) {
                down(nums, i, nums.length - 1);
            }
        }

        public void down(int[] nums, int u, int r) {
            int t = u;
            if (2 * u + 1 <= r && nums[2 * u + 1] > nums[t])
                t = 2 * u + 1;
            if (2 * u + 2 <= r && nums[2 * u + 2] > nums[t])
                t = 2 * u + 2;
            if (u != t) {
                int temp = nums[u];
                nums[u] = nums[t];
                nums[t] = temp;
                down(nums, t, r);
            }
        }
    }
}
