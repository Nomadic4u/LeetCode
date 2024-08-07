import java.util.*;

public class LeetCode_49_3 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] num = new char[26];
                for (char c : str.toCharArray())
                    num[c - 'a'] ++;
                if(map.containsKey(String.valueOf(num))) {
                    List<String> temp = map.get(String.valueOf(num));
                    temp.add(str);
                    map.put(String.valueOf(num), temp);
                } else {
                    List<String> temp = new LinkedList<>();
                    temp.add(str);
                    map.put(String.valueOf(num), temp);
                }
            }
            return new ArrayList<>(map.values());
        }
    }
}
