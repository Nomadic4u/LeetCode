import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_1276 {
    class Solution {
        public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
            int x = tomatoSlices - 2 * cheeseSlices;
            int y = 4 * cheeseSlices - tomatoSlices;
            if (x % 2 == 0 && y % 2 == 0 && x >=0 && y >= 0) {
                return new ArrayList<>(Arrays.asList(x / 2, y / 2));
            }
            return new ArrayList<>();
        }
    }
}
