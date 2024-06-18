import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            int[][] str = new int[numRows + 1][numRows + 1];
            for(int i = 1; i <= numRows; i ++) {
                str[i][1] = 1;
                str[i][i] = 1;
            }

            for(int i = 1; i <= numRows; i ++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(str[i][1]);
                for(int j = 2; j <= i; j ++) {
                    str[i][j] = str[i - 1][j - 1] + str[i - 1][j];
                    temp.add(str[i][j]);
                }
                list.add(temp);
            }
            return list;
        }
    }
}
