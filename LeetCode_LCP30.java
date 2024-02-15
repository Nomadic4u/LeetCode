import java.util.ArrayList;
import java.util.PriorityQueue;

public class LeetCode_LCP30 {
    class Solution {
        public int magicTower(int[] nums) {
            int num = 1;
            for (int i : nums) {
                num += i;
            }
            if(num < 0)
                return -1;


            int sum = 1, index = 0;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int count : nums) {
                sum += count;
                if(count < 0) {
                    priorityQueue.add(count);
                }
                if(sum <= 0) {
                    sum -= priorityQueue.poll();
                    index ++;
                }
            }
            return index;
        }
    }
}
