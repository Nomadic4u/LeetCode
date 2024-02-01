public class LeetCode_1137 {
    class Solution {
        public int tribonacci(int n) {
            if(n == 0 || n ==1)
                return n;
            if(n == 2)
                return 1;
            if(n == 3)
                return 2;
            if(n == 4)
                return 4;
            return 2 * tribonacci(n - 1) - tribonacci(n - 4);
        }

    }
}
