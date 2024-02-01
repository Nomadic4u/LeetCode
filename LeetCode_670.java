public class LeetCode_670 {
    class Solution {
        public int maximumSwap(int num) {
            int max_count = num;
            for (int i = 0; i < String.valueOf(num).length() - 1; i++) {
                for (int j = i + 1; j < String.valueOf(num).length(); j++) {
                    int count = num;
                    count -= (int) (Math.pow(10, String.valueOf(num).length() - 1 - i)) * (int) (String.valueOf(num).charAt(i));
                    count += (int) (Math.pow(10, String.valueOf(num).length() - 1 - i)) * (int) (String.valueOf(num).charAt(j));
                    count -= (int) (Math.pow(10, String.valueOf(num).length() - 1 - j)) * (int) (String.valueOf(num).charAt(j));
                    count += (int) (Math.pow(10, String.valueOf(num).length() - 1 - j)) * (int) (String.valueOf(num).charAt(i));
                    max_count = Math.max(max_count, count);
                }
            }
            return max_count;
        }
    }
}
