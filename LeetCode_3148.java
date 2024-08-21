import java.util.List;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class LeetCode_3148 {
    class Solution {
        public int maxScore(List<List<Integer>> grid) {
            int[][] num = new int[grid.size()][grid.get(0).size()];

            for (int i = 0; i < grid.size(); i++)
                for (int j = 0; j < grid.get(0).size(); j++)
                    num[i][j] = grid.get(i).get(j);

            int max_value = -0x3f3f3f; // 其值可能为负数, 此处不能用0
            int[][] min_value = new int[grid.size()][grid.get(0).size()];

            // 存储当前位置的最小值
            min_value[0][0] = num[0][0]; // 最小值不包括当前位置的值
            for (int i = 1; i < grid.size(); i++) // 第一列初始化
                min_value[i][0] = Math.min(num[i - 1][0], min_value[i - 1][0]);
            for (int i = 1; i < grid.get(0).size(); i++) // 第一行初始化
                min_value[0][i] = Math.min(num[0][i - 1], min_value[0][i - 1]);
            for (int i = 1; i < grid.size(); i++)
                for (int j = 1; j < grid.get(0).size(); j++)
                    min_value[i][j] = Math.min(Math.min(num[i - 1][j], num[i][j - 1]), Math.min(min_value[i - 1][j], min_value[i][j - 1]));


            for (int i = 0; i < grid.size(); i++) {
                for (int j = 0; j < grid.get(0).size(); j++) {
                    if (i == 0 && j == 0) // 此位置忽略
                        continue;
                    max_value = Math.max(max_value, num[i][j] - min_value[i][j]);
                }
            }

            return max_value;
        }
    }
}
