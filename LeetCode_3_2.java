import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode_3_2 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int max_length = 0;
            int left = 0, right = 0;
            while (right < s.length()) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                right++;
                max_length = Math.max(max_length, set.size());
            }
            return max_length;
        }
    }
}
