public class LeetCode_76_2 {
    class Solution {
        public String minWindow(String s, String t) {
            char[] str = s.toCharArray();
            int min_left = -1, min_right = s.length();
            int left = 0;
            int[] cnt_s = new int[128];
            int[] cnt_t = new int[128];
            for (char c : t.toCharArray())
                cnt_t[c]++;
            for (int right = 0; right < s.length(); right++) {
                cnt_s[str[right]]++;
                while (isCovered(cnt_s, cnt_t)) {
                    if (right - left < min_right - min_left) {
                        min_left = left;
                        min_right = right;
                    }
                    cnt_s[str[left++]]--;
                }
            }
            return min_left == -1 ? "" : s.substring(min_left, min_right + 1);
        }

        public boolean isCovered(int[] cnt_s, int[] cnt_t) {
            for (int i = 'a'; i <= 'z'; i++) {
                if (cnt_s[i] < cnt_t[i])
                    return false;
            }

            for (int i = 'A'; i <= 'Z'; i++) {
                if (cnt_s[i] < cnt_t[i])
                    return false;
            }
            return true;
        }
    }
}
