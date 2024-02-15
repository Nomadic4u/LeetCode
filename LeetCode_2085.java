import java.util.HashSet;
import java.util.Set;

public class LeetCode_2085 {
    class Solution {
        public int countWords(String[] words1, String[] words2) {
            int num = 0;
            for (int i = 0; i < words1.length; i++) {
                int count1 = 0;
                for (int j = 0; j < words1.length; j++) {
                    if (words1[i].equals(words1[j])) {
                        count1++;
                    }
                }

                int count2 = 0;
                for (int j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j])) {
                        count2++;
                    }
                }
                if (count1 == 1 && count2 == 1) {
                    num++;
                }
            }
            return num;
        }
    }

}
