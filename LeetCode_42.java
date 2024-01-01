public class LeetCode_42 {
////    行遍历, 找到符合的
//        class Solution {
//            public int trap(int[] height) {
//                int sum = 0;
//                int max = 0;
//                for (int i = 0; i < height.length; i++) {
//                    if(max < height[i]) {
//                        max = height[i];
//                    }
//                }
//                for (int i = 1; i < max; i++) {
//                    int temp_sum = 0;
//                    boolean is_update_max = false;
//                    for (int j = 0; j < height.length; j++) {
//                        if(is_update_max && height[j] < i) {
//                            temp_sum ++;
//                        }
//                        if(height[j] >= i) {
//                            sum += temp_sum;
//                            is_update_max =  true;
//                            temp_sum = 0;
//                        }
//                    }
//                }
//                return sum;
//            }
//
//        }



////        列遍历, 先找出两个边界 再遍历中间依次与边界中较小的那一个比较
//    class Solution {
//        public int trap(int[] height) {
//            int sum = 0;
//            for (int i = 1; i < height.length - 1; i++) {
//                int max_left = 0;
//                for (int j = i - 1; j >= 0; j--) {
//                    if(max_left < height[j]) {
//                        max_left = height[j];
//                    }
//                }
//                int max_right = 0;
//                for (int j = i + 1; j < height.length; j++) {
//                    if(max_right < height[j]) {
//                        max_right = height[j];
//                    }
//                }
//                int min = Math.min(max_left, max_right);
//                if(min > height[i]) {
//                    sum += min - height[i];
//                }
//            }
//            return sum;
//        }
//    }



//    dp优化列循环
    class Solution {
        public int trap(int[] height) {
            int sum = 0;
            int[] max_left = new int[height.length];
            int[] max_right = new int[height.length];

            for (int i = 1; i < height.length - 1; i++) {
                max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
            }

            for (int i = height.length - 2; i >= 1 ; i--) {
                max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
            }

            for (int i = 1; i < height.length - 1; i++) {
                int min = Math.min(max_left[i], max_right[i]);
                if(height[i] < min) {
                    sum += min - height[i];
                }
            }
            return sum;
        }
    }
}
