import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class LeetCode_17_2 {
    class Solution {
        String[] str = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        List<String> list = new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            if(digits.equals(""))
                return list;
            DFS(digits, 0, "");
            return list;
        }

        public void DFS(String digits, int index, String s) {
            if(index == digits.length()) {
                list.add(s);
                return;
            }
            String letter = str[digits.charAt(index) - '0'];
            for (int i = 0; i < letter.length(); i++)
                DFS(digits, index + 1, s + letter.charAt(i));
        }
    }
}
