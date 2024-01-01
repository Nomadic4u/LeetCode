import java.util.Arrays;

public class LeetCode_2706 {
    class Solution {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);

            int sum = prices[0] + prices[1];

            return (sum >= 0) ? money - sum : money;
        }
    }
}
