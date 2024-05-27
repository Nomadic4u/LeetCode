import java.util.*;

public class LeetCode_438 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            HashMap<Character, Integer> map_1 = new HashMap<>();
            HashMap<Character, Integer> map_2 = new HashMap<>();

            for (int i = 0; i < p.length(); i++) {
                if (map_2.containsKey(p.charAt(i)))
                    map_2.put(p.charAt(i), map_2.get(p.charAt(i)) + 1);
                else
                    map_2.put(p.charAt(i), 1);
            }

            Queue<Character> queue = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            int left = 0, right = -1;

            while (right < s.length()) {
                if (right != s.length() - 1 && queue.size() < p.length()) {
                    queue.add(s.charAt(++right));
                    if (map_1.containsKey(s.charAt(right)))
                        map_1.put(s.charAt(right), map_1.get(s.charAt(right)) + 1);
                    else
                        map_1.put(s.charAt(right), 1);
                    continue;
                }

                if (map_1.equals(map_2))
                    list.add(left);
                if (right != s.length() - 1) {
                    queue.add(s.charAt(++right));
                    queue.poll();

                    if (map_1.containsKey(s.charAt(right)))
                        map_1.put(s.charAt(right), map_1.get(s.charAt(right)) + 1);
                    else
                        map_1.put(s.charAt(right), 1);

                    if (map_1.get(s.charAt(left)) > 1)
                        map_1.put(s.charAt(left), map_1.get(s.charAt(left)) - 1);
                    else
                        map_1.remove(s.charAt(left));
                    left++;
                } else
                    right++;
            }
            return list;
        }
    }
}
