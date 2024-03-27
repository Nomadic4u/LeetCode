import java.util.ArrayList;
import java.util.List;

/**
 * 相当于一个排列组合 将三个点插入字符串中, 然后用一个函数去检查其中四个值是否合法
 */

public class LeetCode_93 {
    class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> list = new ArrayList<>();
            int len = s.length();
            if (len < 4 || len > 12)
                return list;
            for (int i = 1; i < 4 && i < len - 2; i++) {
                for (int j = i + 1; j < i + 4 && j < len - 1; j++) {
                    for (int k = j + 1; k < j + 4 && k < len; k++) {
                        String ip_1 = s.substring(0, i);
                        String ip_2 = s.substring(i, j);
                        String ip_3 = s.substring(j, k);
                        String ip_4 = s.substring(k, len);
                        System.out.println("ip1:" + ip_1 + " ip2:" + ip_2 + " ip3:" + ip_3 + " ip4:" + ip_4);
                        if (is_valid(ip_1) && is_valid(ip_2) && is_valid(ip_3) && is_valid(ip_4)) {
                            String str = ip_1 + "." + ip_2 + "." + ip_3 + "." + ip_4;
                            list.add(str);
                        }

                    }
                }
            }
            return list;
        }

        public boolean is_valid(String s) {
//            System.out.println(s);
            if (s.isEmpty() || s.length() >= 4)
                return false;
            if (s.charAt(0) == '0' && s.length() != 1)
                return false;
            int len = s.length();
            int num = 0;
            for (int i = len - 1; i >= 0; i--) {
                num += (int) ((s.charAt(i) - '0') * Math.pow(10, len - i - 1));
            }
//            System.out.println(s + " " +num);
            if (num >= 0 && num <= 255)
                return true;
            else
                return false;
        }
    }
}
