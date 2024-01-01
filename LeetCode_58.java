public class LeetCode_58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int len = s.length(), num = 0;
            int i;
            for(i = len - 1; i >= 0; i--) {
                if(s.charAt(i) != ' ')
                    break;
            }
            for(; i >= 0; i --) {
                if(s.charAt(i) == ' ')
                    break;
                num ++;
            }
            return num;
        }
    }
}
