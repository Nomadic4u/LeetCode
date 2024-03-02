import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_2368 {
    class Solution {
        public int reachableNodes(int n, int[][] edges, int[] restricted) {
            List<List<Integer>> graph = new ArrayList<>();
            Set<Integer> restrictedSet = new HashSet<>();
            for (int i : restricted) {
                restrictedSet.add(i);
            }
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }
            boolean[] visited = new boolean[n];
            visited[0] = true;
            return dfs(0, restrictedSet, visited, graph);
        }

        public int dfs(int node, Set<Integer> restrictedSet, boolean[] visited, List<List<Integer>> graph) {
            if (restrictedSet.contains(node)) {
                return 0;
            }
            int count = 1;
            for (Integer next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    count += dfs(next, restrictedSet, visited, graph);
                }
            }
            return count;
        }
    }
}
