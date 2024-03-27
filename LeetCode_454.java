import java.util.HashMap;

public class LeetCode_454 {
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int res = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    for (int k = 0; k < nums3.length; k++) {
                        int count = -(nums1[i] + nums2[j] + nums3[k]);
                        if(map.containsKey(count))
                            res ++;

                    }
                }
            }
        }
    }
}
