import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode_1962 {
    class Solution {
        public int minStoneSum(int[] piles, int k) {
            Queue<Integer> A = new PriorityQueue<>((x, y) -> y - x);
            int sum = 0;
            for (int x : piles) {
                A.add(x);
            }

            for (int i = 0; i < k; i++) {
                int num = A.poll();
                A.add(num - num / 2);
            }

            for (int x : A) {
                sum += x;
            }

            return sum;
        }
    }
}
