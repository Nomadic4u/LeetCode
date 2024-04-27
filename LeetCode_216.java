import java.util.LinkedList;
import java.util.List;

public class LeetCode_216 {
    class Solution {


        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> list = new LinkedList<>();
            boolean[] visited = new boolean[10];
            DFS(list, new LinkedList<>(), k, n, visited, 0, 1);
            return list;
        }

        public void DFS(List<List<Integer>> list, List<Integer> temp, int k, int n, boolean[] visited, int sum, int count) {
            if (temp.size() >= k) {
                if (sum == n) {
                    System.out.println("wdnmd");
                    List<Integer> temp_2 = new LinkedList<>(temp);
                    list.add(temp_2);
                }
                return;
            }

//            visited[count] = true;

            for (int i = count; i < 10; i++) {
                if (visited[i])
                    continue;
                sum += i;
                temp.add(i);
                visited[i] = true;
                DFS(list, temp, k, n, visited, sum, i + 1);
                sum -= i;
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
