public class LeetCode_415 {
    class Solution {
        public String addStrings(String num1, String num2) {
            String answer = new String();
            int cur = 0;
            int len1 = num1.length() - 1, len2 = num2.length() - 1;
            while (len1 >= 0 || len2 >= 0 || cur > 0) {
                if (len1 >= 0)
                    cur += num1.charAt(len1--) - '0';
                if (len2 >= 0)
                    cur += num2.charAt(len2--) - '0';
                answer += String.valueOf(cur % 10);
                cur /= 10;
            }
            StringBuilder sb = new StringBuilder(answer);
            return sb.reverse().toString();
        }
    }
}
