import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LeetCode_739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Deque<Integer> stack = new LinkedList<>();
            for (int i = 0; i < temperatures.length; i++) {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                        res[stack.peek()] = i - stack.peek();
                        stack.pop();
                    }
                }
                stack.push(i);
            }
            return res;
        }
    }
}
