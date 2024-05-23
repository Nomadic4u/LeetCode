import java.util.LinkedList;
import java.util.List;

public class LeetCode_51 {
    class Solution {
        public List<List<String>> list = new LinkedList<>();

        public List<List<String>> solveNQueens(int n) {
            char[][] str = new char[n][n];
//            boolean[] row = new boolean[n + 1];
            boolean[] col = new boolean[n * 2];
            boolean[] x = new boolean[n * 2];
            boolean[] y = new boolean[n * 2];
            DFS(str, col, x, y, 0, n);
            return list;
        }

        public void DFS(char[][] str, boolean[] col, boolean[] x, boolean[] y, int index, int n) {
            if (index >= n) {
                List<String> temp = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (str[i][j] != 'Q')
                            str[i][j] = '.';
                    }
                    System.out.println(String.valueOf(str[i]));
                    temp.add(String.valueOf(str[i]));
                }
                list.add(temp);
            }

            for (int i = 0; i < n; i++) {
                if (!col[i] && !x[i - index + n] && !y[i + index]) {
                    str[index][i] = 'Q';
                    col[i] = true;
                    x[i - index + n] = true;
                    y[i + index] = true;
                    DFS(str, col, x, y, index + 1, n);
                    str[index][i] = '.';
                    col[i] = false;
                    x[i - index + n] = false;
                    y[i + index] = false;
                }
            }
        }
    }
}
