import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_36 {
    class Solution {
        public boolean isValidSudoku(char[][] board) {

            Set<Character> set = new HashSet<>();

            // 每一行
            for (int i = 0; i < board.length; i++) {
                set.clear();
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '.')
                        continue;
                    if (set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }

            // 每一列
            for (int i = 0; i < board[0].length; i++) {
                set.clear();
                for (int j = 0; j < board.length; j++) {
                    if (board[j][i] == '.')
                        continue;
                    if (set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }

            // 九宫格内
            for (int i = 0; i < board.length; i += 3) {
                for (int j = 0; j < board[0].length; j += 3) {
                    set.clear();
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            if (board[k][l] == '.')
                                continue;
                            if (set.contains(board[k][l]))
                                return false;
                            set.add(board[k][l]);
                        }
                    }
                }
            }

            return true;
        }
    }
}
