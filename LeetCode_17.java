import java.util.ArrayList;
import java.util.List;

public class LeetCode_17 {
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> list = new ArrayList<>();
            if (digits.isEmpty()) {
                return list;
            }
            String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            for (int i = 0; i < digits.length(); i++) {
                int index = digits.charAt(i) - '0';
                if (index == 0 || index > 9) {
                    continue;
                }
                String s = str[index - 2];
                if (list.isEmpty()) {
                    for (int j = 0; j < s.length(); j++) {
                        list.add(String.valueOf(s.charAt(j)));
                        System.out.println(list);
                    }
                }
                else {
                    List<String> temp = new ArrayList<>();
                    for (int j = 0; j < list.size(); j++) {
                        for (int k = 0; k < s.length(); k++) {
                            temp.add(list.get(j) + s.charAt(k));
                        }
                    }
                    list = temp;
                }
            }
            return list;
        }
    }
}
