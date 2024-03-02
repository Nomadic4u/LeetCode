import java.util.Arrays;

public class LeetCode_2734 {
    class Solution {
        public String smallestString(String s) {
            var str = s.toCharArray();
            int len = s.length();
            for (int i = 0; i < len; i++) {
                if(str[i] != 'a') {
                    for (; i < len && str[i] > 'a'; i ++)
                        str[i] --;
                    return new String(str);
                }
            }
            str[len - 1] = 'z';
            return new String(str);
        }
    }
}
