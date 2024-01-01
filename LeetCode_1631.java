import java.util.Queue;

public class LeetCode_1631 {
    public int minimumEffortPath(int[][] heights) {
        int[][] len = new int[heights.length + 10][heights[0].length + 10];
        int dx[] = new int[]{1, 0, -1, 0};
        int dy[] = new int[]{0, 1, 0, -1};
        int q[][] =  new int[heights.length * heights[0].length][2];
        int num = 0x3f3f3f3f;
        for (int i = 0; i < heights.length + 10; i++) {
            for (int j = 0; j < heights[0].length + 10; j++) {
                len[i][j] = -1;
            }
        }
        len[0][0] = 0;

        int hh = 0, tt = 0;
        while(hh <= tt) {
            int[] t = q[hh++];
            for (int i = 0; i < 4; i++) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if(x >= 0 && x < heights.length && y >= 0 && y < heights[0].length && len[x][y] == -1) {
                    len[x][y] = len[t[0]][t[1]] + Math.abs(heights[x][y]- heights[t[0]][t[1]]);
                    if(x == heights.length - 1&& y == heights[0].length - 1) {
                        num = Math.min(num, len[x][y]);
                    }
                    q[++tt] = new int[]{x, y};
                }
            }
        }
        return num;
    }
}
