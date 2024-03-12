import java.util.ArrayList;
import java.util.List;

public class LeetCode_46 {
    class Solution {
        List<List<Integer>> list = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {

                DFS(nums, new int[nums.length], new boolean[nums.length], 0);
            return list;
        }

        public void DFS(int[] nums, int[] count, boolean[] visited, int index) {
            if (index >= nums.length) {
                List<Integer> res = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    res.add(count[i]);
                }
                list.add(res);
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    count[index] = nums[i];
                    visited[i] = true;
                    DFS(nums, count, visited, index + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
