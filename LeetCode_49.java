import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            int index = 1;
            int[] str = new int[strs.length];
            List<HashMap<Character, Integer>> list = new LinkedList<>();
            HashMap<HashMap<Character, Integer>, List<String>> hashMap = new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                HashMap<Character, Integer> map = new HashMap<>();
                for (int j = 0; j < strs[i].length(); j++) {
                    if (map.containsKey(strs[i].charAt(j))) {
                        map.put(strs[i].charAt(j), map.get(strs[i].charAt(j)) + 1);
                    } else {
                        map.put(strs[i].charAt(j), 1);
                    }
                }
                list.add(map);
            }

            for (int i = 0; i < strs.length; i++) {
                if (hashMap.containsKey(list.get(i))) {
                    List<String> temp = hashMap.get(list.get(i));
                    temp.add(strs[i]);
                    hashMap.put(list.get(i), temp);
                } else {
                    List<String> temp = new LinkedList<>();
                    temp.add(strs[i]);
                    hashMap.put(list.get(i), temp);
                }
            }

            List<List<String>> now = new LinkedList<>();
            for (List<String> value : hashMap.values()) {
                now.add(value);
            }
            return now;
        }
    }
}
