public class LeetCode_5 {
    class Solution {
        public String longestPalindrome(String s) {
            boolean[][] str = new boolean[s.length()][s.length()];
            int res = 0, start = 0, end = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = i; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j)) {
                        if (j - i <= 1)
                            str[i][j] = true;
                        else {
                            if (str[i + 1][j - 1]) {
                                str[i][j] = true;
                            }
                        }
                        if(str[i][j] && res < j - i + 1) {
                            res = j - i + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
            System.out.println(start + ":" + end);
            return s.substring(start, end + 1);
        }
    }
}
