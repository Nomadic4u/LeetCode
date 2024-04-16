import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class LeetCode_42_2 {
    /**
     * 运用dp, 对于每一个柱子, 找到左边的最高和右边的最高, 如果柱子小于两者的较小值, 则可以存储雨水, 否则不能
     */
    class Solution {
        public int trap(int[] height) {
            int[] left = new int[height.length + 1];
            int[] right = new int[height.length + 1];
            for (int i = 1; i < height.length; i++)
                left[i] = Math.max(left[i - 1], height[i - 1]);
            for (int i = height.length - 2; i >= 0; i--)
                right[i] = Math.max(right[i + 1], height[i + 1]);
            int sum = 0;
            for (int i = 0; i < height.length; i++) {
                int min = Math.min(left[i], right[i]);
                if (height[i] < min)
                    sum += min - height[i];
            }
            return sum;
        }
    }
}
