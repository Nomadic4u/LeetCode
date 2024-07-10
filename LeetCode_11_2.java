public class LeetCode_11_2 {
    class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int max_water = 0;
            while (left < right) {
                max_water = Math.max(max_water, (right - left) * Math.min(height[left], height[right]));
                if (height[left] < height[right])
                    left++;
                else
                    right--;
            }
            return max_water;
        }
    }
}
