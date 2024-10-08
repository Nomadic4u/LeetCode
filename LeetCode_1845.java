import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode_1845 {
    class SeatManager {

        public static Queue<Integer> queue = new PriorityQueue<>();

        public SeatManager(int n) {
            for (int i = 1; i <= n; i++)
                queue.add(i);
        }

        public int reserve() {
            return queue.poll();
        }

        public void unreserve(int seatNumber) {
            queue.add(seatNumber);
        }
    }

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
}
