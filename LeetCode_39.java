import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_39 {
    class Solution {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            HashSet<List<Integer>> set = new HashSet<>();
            List<List<Integer>> list = new LinkedList<>();
            List<Integer> temp = new LinkedList<>();
            DFS(set, candidates, target, 0, temp, 0);
            list.addAll(set);
            return list;
        }

        public void DFS(HashSet<List<Integer>> set, int[] candidates, int target, int start, List<Integer> temp, int sum) {
            if (sum > target) {
                return;
            }
            if (sum == target) {
                set.add(new LinkedList<>(temp));
                System.out.println(set);
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                sum += candidates[i];
                temp.add(candidates[i]);
                DFS(set, candidates, target, i, temp, sum);
                sum -= candidates[i];
                temp.remove(temp.size() - 1);
            }
        }
    }
}
