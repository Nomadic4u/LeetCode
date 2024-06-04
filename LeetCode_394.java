import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_394 {
    class Solution {
        public String decodeString(String s) {
            Deque<Integer> nums = new ArrayDeque<>();
            Deque<String> str = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    nums.addLast(i - '0');
                else {
                    if()
                }
            }
        }
    }
}
