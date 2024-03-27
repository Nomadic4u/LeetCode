public class LeetCode_303 {
    class NumArray {
        private int[] count = new int[100000];

        public NumArray(int[] nums) {
            count[1] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                count[i + 1] = count[i] + nums[i];
            }

        }

        public int sumRange(int left, int right) {
            return count[right + 1] - count[left];
        }
    }

}
