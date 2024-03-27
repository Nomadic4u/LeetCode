public class LeetCode_977 {
//    class Solution {
//        public int[] sortedSquares(int[] nums) {
//            int[] count = new int[nums.length];
//            if (nums.length == 1) {
//                nums[0] = nums[0] * nums[0];
//                return nums;
//            }
//            int index = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] >= 0) {
//                    index = i;
//                    break;
//                }
//                index = i;
//            }
//            int left = index - 1, right = index;
//            if (index == 0) {
//                left++;
//                right++;
//            }
////            System.out.println(left);
//            int i = 0;
//            for (; left >= 0 && right <= nums.length - 1; ) {
//                if (nums[left] * nums[left] <= nums[right] * nums[right]) {
//                    count[i++] = nums[left] * nums[left];
//                    left--;
//                } else {
//                    count[i++] = nums[right] * nums[right];
//                    right++;
//                }
//            }
//
//            while(left >= 0) {
//                count[i++] = nums[left] * nums[left];
//                left--;
//            }
//            while(right <= nums.length - 1) {
//                count[i++] = nums[right] * nums[right];
//                right++;
//            }
//            return count;
//        }
//
//    }

    class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0, right = nums.length - 1;
            int[] count = new int[nums.length];
            int index = nums.length - 1;
            while (left <= right) {
                if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                    count[index--] = nums[right] * nums[right];
                    right--;
                } else {
                    count[index--] = nums[left] * nums[left];
                    left++;
                }
            }
            return count;
        }
    }


}
