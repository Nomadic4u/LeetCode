public class LeetCode_2864 {
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    count++;
            }
            char[] res = new char[s.length()];
            for (int i = 0; i < count - 1; i++) {
                res[i] = '1';
            }
            for (int i = count - 1; i < s.length() - 1; i++) {
                res[i] = '0';
            }
            res[s.length() - 1] = '1';
            return String.valueOf(res);
        }
    }
}
