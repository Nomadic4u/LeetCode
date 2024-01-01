public class LeetCode_28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            Integer len1 =  haystack.length();
            Integer len2 =  needle.length();
            if(len1 < len2)
                return -1;
            for(int i = 0; i < len1; i ++) {
                int num = i;
                for(int j = 0; j < len2 && num < len1;) {

                    if(haystack.charAt(num) == needle.charAt(j)) {
                        j ++;
                        num ++;
                    }
                    else {
                        break;
                    }
                    if(j  == len2) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
