import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class LeetCode_49_2 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] count = new char[26];
                for (int i = 0; i < str.length(); i++)
                    count[str.charAt(i) - 'a']++;
                if (map.containsKey(String.valueOf(count))) {
                    List<String> temp = map.get(String.valueOf(count));
                    temp.add(str);
                    map.put(String.valueOf(count), temp);
                } else {
                    List<String> temp = new ArrayList<>();
                    temp.add(str);
                    map.put(String.valueOf(count), temp);
                }
            }
            return new ArrayList<>(map.values());
        }
    }
}
