import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode_739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < temperatures.length; i++) {
                if (stack.isEmpty())
                    stack.push(i);
                else {
                    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                        res[stack.peek()] = i - stack.peek();
                        stack.pop();
                    }
                    stack.push(i);
                }
            }
            return res;
        }
    }
}
