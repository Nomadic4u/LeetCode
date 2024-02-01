public class LeetCode_2128 {
    class Solution {
        public String repeatLimitedString(String s, int repeatLimit) {
//            先讲s中的字符从大到小进行排序
            char[] s1 = s.toCharArray();
            for (int i = 0; i < s1.length - 1; i++) {
                for (int j = i + 1; j < s1.length; j++) {
                    if(s1[i] < s1[j]) {
                        char temp = s1[i];
                        s1[i] = s1[j];
                        s1[j] = temp;
                    }
                }
            }

            boolean[] used = new boolean[s1.length];
            char[] s2 = new char[s1.length];
            s2[0] = s1[0];
            used[0]= true;
            int index = 1;
            int num = 1;
            while(true) {
                for (int i = 0; i < s1.length; i++) {
                    if(!used[i] && (s1[i] == s2[index - 1] && num < repeatLimit)) {
                        s2[index++] = s1[i];
//                        num
                    }
                }
            }
        }
    }
}
