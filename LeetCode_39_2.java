import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode_39_2 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> list = new ArrayList<>();
            Deque<Integer> deque = new ArrayDeque<>();
            dfs(candidates, target, deque, 0, list);
            return list;
        }

        public void dfs(int[] candidates, int target, Deque<Integer> deque, int start, List<List<Integer>> list) {
            if (target < 0)
                return;
            if (target == 0) {
                list.add(new ArrayList<>(deque));
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                deque.addLast(candidates[i]);
                dfs(candidates, target - candidates[i], deque, i, list);
                deque.removeLast();
            }
        }
    }
}
