import java.util.Arrays;

public class LeetCode_26 {
    class Solution {
        public  int removeDuplicates(int[] nums) {
            int len = nums.length;
            int count = nums[0], index = 1;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] == count) {
                    len --;
                } else {
                    count = nums[i];
                    nums[index ++] = count;
                }
            }
            return len;
        }
    }

}
