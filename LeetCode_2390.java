import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class LeetCode_2390 {
    class Solution {
        public String removeStars(String s) {
            Deque<Character> stack = new LinkedList<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*')
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            }

            StringBuilder sb = new StringBuilder();

            while (!stack.isEmpty())
                sb.append(stack.pop());

            return sb.reverse().toString();
        }
    }
}
