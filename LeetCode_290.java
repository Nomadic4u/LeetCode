import java.util.HashMap;
import java.util.List;

public class LeetCode_290 {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] list = s.split(" ");
            if(list.length != pattern.length())
                return false;
            HashMap<Character, String> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                if (map.containsKey(pattern.charAt(i))) {
                    if (!list[i].equals(map.get(pattern.charAt(i))))
                        return false;
                }
                if (map.containsValue(list[i]) && !map.containsKey(pattern.charAt(i)))
                    return false;
                map.put(pattern.charAt(i), list[i]);
            }
            return true;
        }
    }
}
