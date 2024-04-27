import java.util.Arrays;

public class LeetCode_377 {


    class Solution {
        private  int res = 0;
        public int combinationSum4(int[] nums, int target) {
            Arrays.sort(nums);
            DFS(nums, target, 0);
            return res;
        }

        public void DFS(int[] nums, int target, int sum) {

            if (sum == target) {
                res++;

                return;
            }

            if (sum > target)
                return;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] <= target) {
                    sum += nums[i];
                    DFS(nums, target, sum);
                    sum -= nums[i];
                } else {
                    break;
                }
            }
        }
    }
}
