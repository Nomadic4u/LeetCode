public class LeetCode_14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            StringBuilder sb = new StringBuilder();
            int min = 0x3f3f3f, index = 0;
            for (int i = 0; i < strs.length; i++) {
                if(min > strs[i].length()) {
                    min = strs[i].length();
                    index = i;
                }
            }
            for (int i = 0; i < strs[index].length(); i++) {
                sb.append(strs[index].charAt(i));
                System.out.println("TT :" + sb);
                for (int j = 0; j < strs.length; j++) {
                    if(!strs[j].startsWith(sb.toString()))
                        return sb.deleteCharAt(sb.toString().length() - 1).toString();
                }
            }
            return sb.toString();
        }
    }
}
