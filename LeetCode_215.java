import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode_215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Queue<Integer> queue = new PriorityQueue<>((x, y) -> (y - x));
            for (int num : nums)
                queue.add(num);

            for (int i = 0; i < k - 1; i++)
                queue.poll();

            return queue.peek();
        }
    }
}
