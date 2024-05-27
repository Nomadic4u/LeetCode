import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_438_2 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            if (s.length() < p.length())
                return new ArrayList<>();
            int[] count_s = new int[26];
            int[] count_p = new int[26];
            for (int i = 0; i < p.length(); i++) {
                count_s[s.charAt(i) - 'a']++;
                count_p[p.charAt(i) - 'a']++;
            }
            List<Integer> list = new ArrayList<>();
            if (Arrays.equals(count_p, count_s))
                list.add(0);
            for (int i = 0; i < s.length() - p.length(); i++) {
                count_s[s.charAt(i) - 'a']--;
                count_s[s.charAt(i + p.length()) - 'a']++;
                if (Arrays.equals(count_p, count_s))
                    list.add(i + 1);
            }
            return list;
        }
    }
}
