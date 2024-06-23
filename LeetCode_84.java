import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode_84 {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            if (heights.length == 1)
                return heights[0];
            int[] new_height = new int[heights.length + 2];
            new_height[0] = 0;
            for (int i = 0; i < heights.length; i++)
                new_height[i + 1] = heights[i];
            heights = new_height;
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(0);
            int res = 0;
            for (int i = 1; i < heights.length; i++) {
                if (heights[stack.peek()] < heights[i]) {
                    stack.push(i);
                } else if (heights[stack.peek()] == heights[i]) {
                    stack.pop();
                    stack.push(i);
                } else {
                    while (heights[stack.peek()] > heights[i]) {
                        int mid = stack.pop();
                        int left = stack.peek();
                        int right = i;
                        int wide = right - left - 1;
                        int high = heights[mid];
                        res = Math.max(res, wide * high);
                    }
                    stack.push(i);
                }
            }
            return res;
        }
    }
}
