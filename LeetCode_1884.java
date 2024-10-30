public class LeetCode_1884 {
    class Solution {
        public int twoEggDrop(int n) {
            int num = 0;
            int res = 0;
            while (n > num) {
                n -= num;
                num++;
                res++;
            }
            return res;
        }
    }
}
