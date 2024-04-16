import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode_496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] res = new int[nums1.length];
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums1.length; i ++) {
                list.add(nums1[i]);
                res[i] = -1;
            }
            for (int i = 0; i < nums2.length; i++) {
                if (stack.isEmpty())
                    stack.push(i);
                else {
                    while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                        if (list.contains(nums2[stack.peek()])) {
                            res[list.indexOf(nums2[stack.peek()])] = nums2[i];
                        }
                        stack.pop();
                    }
                    stack.push(i);
                }
            }
            return res;
        }
    }
}
