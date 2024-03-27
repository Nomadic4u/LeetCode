import java.util.HashMap;

public class LeetCode_1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            if (nums.length == 0 || nums.length == 1)
                return res;
            HashMap<Integer, Integer> result = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int count = target - nums[i];
                if (result.containsKey(count)) {
                    res[0] = i;
                    res[1] = result.get(count);
                    return res;
                }
                result.put(nums[i], i);
            }
            return res;
        }
    }
}
