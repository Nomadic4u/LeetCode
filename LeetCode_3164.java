import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_3164 {
    class Solution {
        public long numberOfPairs(int[] nums1, int[] nums2, int k) {
            HashMap<Integer, Long> hash = new HashMap<>();

            int num_max = 0;

            for (int i = 0; i < nums1.length; i++) {
                hash.put(nums1[i], hash.getOrDefault(nums1[i], 0L) + 1);
                num_max = Math.max(num_max, nums1[i]);
            }

            HashMap<Integer, Long> hash_2 = new HashMap<>();

            for (int i = 0; i < nums2.length; i++)
                hash_2.put(nums2[i], hash_2.getOrDefault(nums2[i], 0L) + 1);

            long res = 0;

            for (Integer i : hash_2.keySet())
                for (int j = 1; i * k * j <= num_max; j++)
                    if (hash.containsKey(i * k * j))
                        res += hash.get(i * k * j) * hash_2.get(i);

            return res;
        }
    }
}
