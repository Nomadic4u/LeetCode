public class LeetCode_329 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int len1 = s.length();
            int len2 = t.length();
            if(len1 == 0)
                return true;
            if(len2 ==0 || len1 > len2)
                return false;
            int idx1 = 0;
            int idx2 = 0;
            for(; idx2 < len2; idx2 ++) {
                if(s.charAt(idx1) == t.charAt(idx2))
                    idx1 ++;
                if(idx1 >= len1)
                    return true;
            }
            return false;
        }
    }
}
