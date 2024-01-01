import java.util.ArrayDeque;
import java.util.List;
//找到i的前缀和 后缀和 利用单调队列得到单调递增或递减
public class LeetCode_2866 {
    class Solution {
        public long maximumSumOfHeights(List<Integer> maxHeights) {
            int n = maxHeights.size();
            long[] suf = new long[n + 1];
            var stack = new ArrayDeque<Integer>();
            stack.push(n);
            long sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                int x = maxHeights.get(i);
                while(stack.size() > 1 && x <= maxHeights.get(stack.peek())) {
                    int j = stack.pop();
                    sum -= (long) maxHeights.get(j) * (stack.peek() - j);
                }
                sum +=  (long) x * (stack.peek() - i);
                suf[i] = sum;
                stack.push(i);
            }

            long ans = sum;
            stack.clear();
            stack.push(-1);
            long pre = 0;
            for (int i = 0; i < n; i++) {
                int x = maxHeights.get(i);
                while(stack.size() > 1 && x <= maxHeights.get(stack.peek())) {
                    int j = stack.pop();
                    pre -= (long) maxHeights.get(j) * (j - stack.peek());
                }
                pre += (long) x * (i - stack.peek());
                ans = Math.max(ans, pre + suf[i + 1]);
                stack.push(i);
            }
            return ans;
        }
    }
}
