import java.util.HashMap;

public class LeetCode_3185 {
    class Solution {
        public long countCompleteDayPairs(int[] hours) {
            HashMap<Integer, Integer> map = new HashMap<>();
            long res = 0;
            for (int i = 0; i < hours.length; i ++) {
                hours[i] = hours[i] % 24;
                if (map.containsKey((24 - hours[i]) % 24))
                    res += map.get((24 - hours[i]) % 24);
                map.put(hours[i], map.getOrDefault(hours[i], 0) + 1);
            }
            return res;

        }
    }
}
