import java.util.HashSet;
import java.util.Set;

public class LeetCode_202 {
//    class Solution {
//        public boolean isHappy(int n) {
//            int count = 0;
//            while (n != 1) {
//                int num1 = n, num2 = 0, num3 = 0;
//                while (num1 != 0) {
//                    num3 = num1 % 10;
//                    num1 /= 10;
//                    num2 += num3 * num3;
//                }
//                n = num2;
//                count++;
//                if (count > 100000) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }


    class Solution {

        public int get_next(int n) {
            int count = 0;
            while (n > 0) {
                int num = n % 10;
                n /= 10;
                count += num * num;
            }
            return count;
        }

        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while (n != 1 && !set.contains(n)) {
                set.add(n);
                n = get_next(n);
            }
            return n == 1;
        }
    }
}
