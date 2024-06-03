import java.util.ArrayList;
import java.util.List;

public class LeetCode_54 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            boolean[][] str = new boolean[matrix.length][matrix[0].length];
            int index = 0;
            int start_x = 0, start_y = 0, end_x = matrix.length - 1, end_y = matrix[0].length - 1;
            boolean has_next = true;
            while (has_next) {
                has_next = false;
                if (index == 0) {
                    for (int i = start_y; i <= end_y; i++) {
                        if (!str[start_x][i]) {
                            list.add(matrix[start_x][i]);
                            str[start_x][i] = true;
                            has_next = true;
                        }
                    }
                    start_x++;
                } else if (index == 1) {
                    for (int i = start_x; i <= end_x; i++) {
                        if (!str[i][end_y]) {
                            list.add(matrix[i][end_y]);
                            str[i][end_y] = true;
                            has_next = true;
                        }
                    }
                    end_y--;
                } else if (index == 2) {
                    for (int i = end_y; i >= start_y; i--) {
                        if (!str[end_x][i]) {
                            list.add(matrix[end_x][i]);
                            str[end_x][i] = true;
                            has_next = true;
                        }
                    }
                    end_x--;
                } else if (index == 3) {
                    for (int i = end_x; i >= start_x; i--) {
                        if (!str[i][start_y]) {
                            list.add(matrix[i][start_y]);
                            str[i][start_y] = true;
                            has_next = true;
                        }
                    }
                    start_y++;
                }
                index = (index + 1) % 4;
            }
            return list;
        }
    }
}
