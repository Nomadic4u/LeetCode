import java.util.HashMap;

public class LeetCode_3146 {
    class Solution {
        public int findPermutationDifference(String s, String t) {
            int sum = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < t.length(); i++)
                map.put(t.charAt(i), i);

            for (int i = 0; i < s.length(); i++)
                sum += Math.abs(i - map.get(s.charAt(i)));

            return sum;
        }
    }
}
