public class LeetCode_121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int max = 0, min = 0x3f3f3f;
            for (int price : prices) {
                min = Math.min(min, price);
                max = Math.max(max, price - min);
            }
            return max;
        }
    }
}
