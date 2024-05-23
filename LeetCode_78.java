import java.util.LinkedList;
import java.util.List;

public class LeetCode_78 {
    class Solution {
        public List<List<Integer>> list = new LinkedList<>();

        public List<List<Integer>> subsets(int[] nums) {
            for (int i = 0; i <= nums.length; i++) {
                DFS(nums, new int[nums.length], new boolean[nums.length], 0, i, 0);
            }
            return list;
        }

        public void DFS(int[] nums, int[] num, boolean[] visit, int index, int max, int begin) {
            if (index >= max) {
                List<Integer> temp = new LinkedList<>();
                for (int i = 0; i < max; i++)
                    temp.add(num[i]);
                list.add(temp);
                return;
            }

            for (int i = begin; i < nums.length; i++) {
                if (!visit[i]) {
                    num[index] = nums[i];
                    visit[i] = true;
                    DFS(nums, num, visit, index + 1, max, i + 1);
                    visit[i] = false;
                }
            }
        }

    }
}
