import java.util.HashSet;

public class LeetCode_128_3 {
    /**
     * 题解的解法, 直接用一个set去存, 然后去遍历, 其中有一个关键点: set中存在 x-1, x必定不是第一个元素, 直接跳过'
     */
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums)
                set.add(num);
            int res = 0;
            for (Integer count : set) {
                if (!set.contains(count - 1)) {
                    int cur = count;
                    int temp_res = 1;
                    while (set.contains(cur + 1)) {
                        temp_res++;
                        cur++;
                    }
                    res = Math.max(res, temp_res);
                }
            }
            return res;
        }
    }
}
