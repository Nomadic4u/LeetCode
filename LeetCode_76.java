import java.util.*;

public class LeetCode_76 {
    class Solution {
        public String minWindow(String s, String t) {
            if (s.length() < t.length())
                return "";
            Deque<Character> deque = new ArrayDeque<>();
            List<String> list = new ArrayList<>();
            HashMap<Character, Integer> map_s = new HashMap<>();
            HashMap<Character, Integer> map_t = new HashMap<>();

            for (int i = 0; i < t.length(); i++)
                map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 0) + 1);

            for (int i = 0; i < s.length(); i++) {
                deque.addLast(s.charAt(i));
                if (map_t.containsKey(s.charAt(i))) {
                    map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
                    if (deque.size() < t.length())
                        continue;
                    while (!map_t.containsKey(deque.peek()) || map_s.get(deque.peek()) > map_t.get(deque.peek())) {
                        Character c = deque.poll();
                        if (map_s.containsKey(c))
                            map_s.put(c, map_s.get(c) - 1);
                    }
                }

                if (check(map_s, map_t)) {
                    StringBuilder sb = new StringBuilder();
                    for (Character c : deque)
                        sb.append(c);
                    list.add(sb.toString());
                }

            }
            int min_len = Integer.MAX_VALUE, index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (min_len > list.get(i).length()) {
                    index = i;
                    min_len = list.get(i).length();
                }
            }
            return list.isEmpty() ? "" : list.get(index);
        }

        public boolean check(HashMap<Character, Integer> map_s, HashMap<Character, Integer> map_t) {
            Set<Character> keySet = map_t.keySet();
            for (Character c : keySet) {
                if (map_s.getOrDefault(c, 0) < map_t.get(c))
                    return false;
            }
            return true;
        }
    }
}
