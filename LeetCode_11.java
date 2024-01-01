public class LeetCode_11 {
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int max = 0;
            for (int i = 0, j = n - 1; i < j ; ) {
                max = Math.max (max, (j - i) * Math.min(height[i], height[j]));
                if(height[i] < height[j]) {
                    i ++;
                } else {
                    j --;
                }
            }

            return max;
        }
    }
}
