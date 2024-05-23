import java.util.LinkedList;
import java.util.List;

public class LeetCode_46_2 {
    class Solution {
        public List<List<Integer>> list = new LinkedList<>();

        public List<List<Integer>> permute(int[] nums) {
            DFS(nums, new int[nums.length], new boolean[nums.length], 0);
            return list;
        }

        public void DFS(int[] nums, int[] num, boolean[] visit, int index) {
            if (index >= nums.length) {
                List<Integer> temp = new LinkedList<>();
                for (int i = 0; i < nums.length; i++)
                    temp.add(num[i]);
                list.add(temp);
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visit[i]) {
                    num[index] = nums[i];
                    visit[i] = true;
                    DFS(nums, num, visit, index + 1);
                    visit[i] = false;
                }
            }
        }
    }
}
