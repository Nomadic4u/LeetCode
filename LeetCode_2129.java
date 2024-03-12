public class LeetCode_2129 {
    class Solution {
        public String capitalizeTitle(String title) {
            StringBuilder s = new StringBuilder(title);
            if (title.isEmpty())
                return title;
            for (int i = 0; i < title.length(); i++) {
                if (title.charAt(i) != ' ') {
                    int j = i;
                    while (j < title.length() && title.charAt(j) != ' ') {
                        s.setCharAt(j, Character.toLowerCase(s.charAt(j)));
                        j++;
                    }
                    if (j - i > 2) {
                        s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                        i = j;
                    }
                }
            }
            return s.toString();
        }
    }
}
