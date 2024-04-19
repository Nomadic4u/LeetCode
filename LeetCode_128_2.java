import java.util.*;

public class LeetCode_128_2 {
    /**
     * 利用sort+滑动窗口, sort时间复杂度为O(nlogn), 滑动窗口时间复杂度为O(n), 应该不会超时,(sort超时了, 悲)
     */
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums)
                set.add(num);
            List<Integer> list = new LinkedList<>();
            for (Integer i : set) {
                list.add(i);
            }


            Collections.sort(list);
            System.out.println(list);
            int start = 0, end = 0, res = 0;
            while (end < list.size()) {
                if (end + 1 < list.size() && list.get(end + 1) == list.get(end) + 1) {
                    end++;
                } else {
                    res = Math.max(res, end - start + 1);
                    start = end + 1;
                    end ++;
                }
            }
            return res;
        }
    }
}
