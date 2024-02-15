import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode_1686 {
    class Solution {
        public int stoneGameVI(int[] aliceValues, int[] bobValues) {
            Integer[] ids = new Integer[aliceValues.length];
            for (int i = 0; i < aliceValues.length; i++) {
                ids[i] = i;
            }

            Arrays.sort(ids, (i, j) -> aliceValues[j] + bobValues[j] - aliceValues[i] - bobValues[i]);
            int diff = 0;
            for (int i = 0; i < aliceValues.length; i++) {
                diff += i % 2 == 0 ? aliceValues[ids[i]] : -bobValues[ids[i]];
            }
            return Integer.compare(diff, 0);
        }
    }

}
