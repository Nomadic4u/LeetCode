import java.util.Arrays;
import java.util.Collections;

public class LeetCode_80 {
//    class Solution {
//        public int removeDuplicates(int[] nums) {
//            int count = nums[0], num = 1;
//            int len = nums.length;
//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] != count) {
//                    count = nums[i];
//                    num = 1;
//                } else {
//                    num++;
//                    if (num > 2) {
//                        nums[i] = 0x3f3f3f3f;
//                        len--;
//                    }
//                }
//            }
//            Arrays.sort(nums);
//            return len;
//        }
//    }

    class Solution {
        public int removeDuplicates(int[] nums) {
            return process(nums, 2);
        }

        private int process(int[] nums, int k) {
            int u = 0;
            for (int num : nums) {
                if(u < k || nums[u - k] != num)
                    nums[u++] = num;
            }
            return u;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(new LeetCode_80().new Solution().removeDuplicates(nums));
    }
}
