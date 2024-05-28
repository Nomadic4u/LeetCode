import java.util.*;

public class LeetCode_560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            // 前缀和
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            List<Integer> s1 = new ArrayList<>();
            s1.add(0);
            map.put(nums[0], s1);
            List<Integer> s2 = map.get(0) == null ? new ArrayList<>() : map.get(0);
            s2.add(-1);
            map.put(0, s2);
            int sum = 0;
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
                List<Integer> temp = map.get(nums[i]) == null ? new ArrayList<>() : map.get(nums[i]);
                temp.add(i);
                map.put(nums[i], temp);
            }

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i] - k)) {
                    List<Integer> tt = map.get(nums[i] - k);
                    Collections.sort(tt);
//                    map.put(nums[i] - k, tt);
                    int count = Collections.binarySearch(tt, i);
                    if(count >= 0)
                        sum += count;
                    else
                        sum -= count + 1;
                }

            }
            return sum;
        }
    }
}
