import java.util.List;

public class LeetCode_2848 {
    class Solution {
        public int numberOfPoints(List<List<Integer>> nums) {
            boolean[] str = new boolean[201];
            for (int i = 0; i < nums.size(); i++) {
                int start = nums.get(i).get(0);
                int end = nums.get(i).get(1);
                for (int j = start; j <= end; j++)
                    str[j] = true;
            }

            int res = 0;
            for (int i = 0; i < str.length; i++)
                res += str[i] == true ? 1 : 0;
            return res;
        }
    }
}
