public class LeetCode_134 {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int sum = 0;
            int[] last = new int[gas.length];
            for (int i = 0; i < gas.length; i++) {
                last[i] = gas[i] - cost[i];
                sum += last[i];
            }
            if (sum < 0) {
                return -1;
            }
            System.out.println(sum);
            int start = 0, all_money = 0;
            for (int i = 0; i < gas.length; i ++) {
                all_money += last[i];
                if (all_money < 0) {
                    start = i + 1;
                    all_money = 0;
                }
            }
            return start;
        }
    }
}
