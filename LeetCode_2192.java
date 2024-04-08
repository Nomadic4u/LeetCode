import java.util.*;

public class LeetCode_2192 {
    class Solution {
        public List<List<Integer>> getAncestors(int n, int[][] edges) {
            // 构建邻接表
            int[][] graph = new int[n][n];
            for (int i = 0; i < edges.length; i++) {
                graph[edges[i][0]][edges[i][1]] = 1;
            }

            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>();
                Queue<Integer> queue = new LinkedList<>();
                for (int j = 0; j < n; j++) {
                    if (graph[j][i] != 0) {
                        temp.add(j);
                        queue.add(j);
                    }
                }
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    if (cur < i) {
                        temp.addAll(list.get(cur));
                    } else {
                        for (int j = 0; j < n; j++) {
                            if (graph[j][cur] != 0 && !temp.contains(j)) {
                                temp.add(j);
                                queue.add(j);
                            }
                        }
                    }
                }
                Collections.sort(temp);
                List<Integer> temp2 = temp.stream().distinct().toList();
                list.add(temp2);
            }
            return list;
        }
    }
}
