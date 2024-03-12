import java.util.HashSet;

public class LeetCode_3 {
    /*
    先用一个滑动窗口去维护一个子串, 并将子串的字符加入一个set中, 如果新的字符在set中重复, 则滑动窗口的左边界右移, 直到新的字符不在set中, 然后继续滑动窗口.
     */
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int left = 0, right = 0;
            int res = 0;
            for (; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left++));
                }
                set.add(s.charAt(right));
                res = Math.max(res, right - left + 1);

            }

            return res;


        }
    }
}
