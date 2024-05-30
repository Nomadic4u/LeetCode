public class LeetCode_11 {
    /**
     * 利用到双指针和贪心的算法, 初始状态从两边向内移动, 然后不断更新容量的最大值, 每次都让较小的一边向内移动
     */
    class Solution {
        public int maxArea(int[] height) {
            int len = height.length;;
            int max = 0;
            for (int i = 0, j = len - 1; i < j;) {
                max = Math.max((j - i) * Math.min(height[i], height[j]), max);
                if(height[i] < height[j])
                    i ++;
                else
                    j --;
            }
            return max;
        }
    }
}
