import java.util.Arrays;
import java.util.Comparator;

public class LeetCode_56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0])
                        return Integer.compare(o1[0], o2[0]);
                    else
                        return Integer.compare(o1[1], o2[1]);
                }
            });

            int sum = intervals.length;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i - 1][1] >= intervals[i][0]) {
                    intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
                    intervals[i - 1][1] = -1;
                    intervals[i][0] = -1;
                    sum--;
                }
            }

            int[][] str = new int[sum][2];
            int index = 0;
            for (int i = 0; i < intervals.length; i++) {
                str[index][0] = intervals[i][0];
                while (intervals[i][1] == -1)
                    i++;
                str[index][1] = intervals[i][1];
                index++;
            }
            return str;
        }
    }
}
