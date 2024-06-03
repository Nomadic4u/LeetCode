import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_239_2 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length - k + 1];
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < nums.length; i++) {
                while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i])
                    deque.removeLast();
                deque.addLast(i);
                if(deque.getFirst() <= i - k)
                    deque.removeFirst();
                if (i >= k - 1)
                    res[i - k + 1] = nums[deque.getFirst()];
            }
            return res;
        }
    }
}
