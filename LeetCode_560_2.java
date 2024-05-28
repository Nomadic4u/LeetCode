import java.util.HashMap;

public class LeetCode_560_2 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0;
            int presum = 0;
            for (int num : nums) {
                presum += num;
                if(map.containsKey(presum - k))
                    sum += map.get(presum - k);
                map.put(presum, map.getOrDefault(presum - k, 0) + 1);
            }
            return sum;
        }
    }
}
