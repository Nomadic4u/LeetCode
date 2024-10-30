public class LeetCode_3216 {
    class Solution {
        public String getSmallestString(String s) {
            int index = -1;
            for (int i = 0; i < s.length() - 1; i++) {
                int num_1 = s.charAt(i) - '0';
                int num_2 = s.charAt(i + 1) - '0';
                if ((num_1 % 2) == (num_2 % 2)) {
                    if (num_1 > num_2) {
                        index = i;
                        break;
                    }
                }
            }

            if (index == -1)
                return s;

            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.setCharAt(index, s.charAt(index + 1));
            sb.setCharAt(index + 1, s.charAt(index));
            return sb.toString();

        }
    }
}
