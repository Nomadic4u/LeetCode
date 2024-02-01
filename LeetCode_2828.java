import java.util.List;

public class LeetCode_2828 {
    class Solution {
        public boolean isAcronym(List<String> words, String s) {
            int len = s.length();
            int index = 0;
            for (String word : words) {
                if(index >= len || word.charAt(0) != s.charAt(index)) {
                    return false;
                }
                index ++;
            }
            if(index== len)
                return true;
            return false; 
        }
    }
}
