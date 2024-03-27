import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode_2671 {
    class FrequencyTracker {

        HashMap<Integer, Integer> map;


        public FrequencyTracker() {
            map = new HashMap<>();
        }

        public void add(int number) {
            map.put(number, map.getOrDefault(number, 0) + 1);

        }

        public void deleteOne(int number) {
            if (map.getOrDefault(number, 0) == 0) return;
            map.put(number, map.getOrDefault(number, 0) - 1);
        }

        public boolean hasFrequency(int frequency) {
            return map.containsValue(frequency);
        }

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */

    }
}