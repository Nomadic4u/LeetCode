import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            int[] count = new int[nums.length - k + 1];
            for (int i = 0; i < nums.length; i++) {
                while (!deque.isEmpty() && deque.peek() < i - k + 1)
                    deque.poll();
                while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                    deque.pollLast();
                deque.add(i);
                if (i >= k - 1)
                    count[i - k + 1] = nums[deque.peek()];
            }
            return count;
        }
    }
}
