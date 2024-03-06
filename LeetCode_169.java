import java.util.HashMap;

public class LeetCode_169 {
//    class Solution {
//        public int majorityElement(int[] nums) {
//            HashMap<Integer, Integer> map = new HashMap();
//            for (int i = 0; i < nums.length; i++) {
//                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//                if (map.get(nums[i]) > nums.length / 2) {
//                    // 返回出现次数大于n/2的数
//                    return nums[i];
//                }
//            }
//            return -1;
//        }
//    }

    //    第二种 摩尔投票法

    /**
     * 因为数组中数字出现的次数超过数组长度的一半, 所有最后出现最多的数字的count一定>0
     */
    class Solution {
        public int majorityElement(int[] nums) {
            int number = nums[0], count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == number) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        number = nums[i];
                        count = 1;
                    }
                }
            }
            return number;
        }
    }
}
