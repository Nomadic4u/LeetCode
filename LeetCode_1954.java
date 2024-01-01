public class LeetCode_1954 {
    class Solution {
        public long minimumPerimeter(long neededApples) {
            long l = 1, r = 10000000;
            while(l < r) {
                long mid = (l + r) / 2;
                long cnt = 2 * mid * (mid + 1) * (2 * mid + 1);
                if(cnt >= neededApples) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l * 8;
        }
    }
}
