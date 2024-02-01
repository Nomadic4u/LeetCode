import java.util.HashSet;

public class LeetCode_2670 {
    class Solution {
        public int[] distinctDifferenceArray(int[] nums) {
            int[] count = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                for (int j = 0; j <= i; j++)
                    set1.add(nums[j]);
                for (int j = i + 1; j < nums.length; j++)
                    set2.add(nums[j]);
                count[i] = set1.size() - set2.size();
            }
            return  count;
        }
    }
}
