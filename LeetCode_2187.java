import java.util.Arrays;

public class LeetCode_2187 {
    class Solution {
        public long minimumTime(int[] time, int totalTrips) {
            long max = 0;
            long left = 1;
            long right = (long) totalTrips * Arrays.stream(time).max().orElse(0);
            long real_trips = 0;
            while (left < right) {
                long mid = (left + right) / 2;
                real_trips = 0;
                for (int i = 0; i < time.length; i++)
                    real_trips += mid / time[i];
                if (real_trips >= totalTrips)
                    right = mid;
                else
                    left = mid + 1;
            }
            return left;
        }
    }
}
