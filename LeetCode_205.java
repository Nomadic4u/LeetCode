import java.util.HashMap;

public class LeetCode_205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            int len = s.length();
            for (int i = 0; i < len; i++) {
                if (map1.containsKey(s.charAt(i))) {
                    if (map1.get(s.charAt(i)) != t.charAt(i))
                        return false;
                } else if (map2.containsKey(t.charAt(i))) {
                    if (map2.get(t.charAt(i)) != s.charAt(i))
                        return false;
                } else {
                    map1.put(s.charAt(i), t.charAt(i));
                    map2.put(t.charAt(i), s.charAt(i));
                }
            }
            return true;
        }
    }
}
