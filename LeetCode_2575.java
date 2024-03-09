public class LeetCode_2575 {
    class Solution {
        public int[] divisibilityArray(String word, int m) {
            int len = word.length();
            long temp = 0;
            int[] res = new int[len];
            for (int i = 0; i < len; i++) {
                temp = (temp * 10 + (word.charAt(i) - '0')) % m;
                res[i] = temp == 0 ? 1 : 0;
            }
            return res;
        }
    }
}
