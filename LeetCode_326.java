public class LeetCode_326 {
    class Solution {
        public boolean isPowerOfThree(int n) {
            if(n == 0)
                return false;
            if(n == 1)
                return true;
            if(n == 2)
                return false;
            if(n % 3 == 1 || n % 3 == 2)
                return false;
            return isPowerOfThree(n / 3);
        }
    }
}
