public class LeetCode_151 {
    class Solution {
        public String reverseWords(String s) {
            String[] str = s.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            for (i = str.length - 1; i >= 0; i--) {
                if(!str[i].isEmpty()) {
                    stringBuilder.append(str[i]);
                    break;
                }
            }

            for(i = i - 1; i >= 0; i --) {
                if(!str[i].isEmpty()) {
                    stringBuilder.append(" " + str[i]);
                }
            }
            System.out.println(str.length);
            return stringBuilder.toString();
        }
    }
}
