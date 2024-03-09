import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCode_15 {
//    class Solution {
//        HashSet<List<Integer>> set = new HashSet<>();
//
//        public List<List<Integer>> threeSum(int[] nums) {
//            boolean[] str = new boolean[nums.length];
//            int[] count = new int[4];
//            DFS(nums, str, count, 0, 0);
//            return new ArrayList<>(set);
//        }
//
//        public void DFS(int[] nums, boolean[] str, int[] count, int index, int wei) {
//            if (index > 2) {
//                if (count[0] + count[1] + count[2] == 0) {
//                    List<Integer> list = new ArrayList<>();
//                    list.add(count[0]);
//                    list.add(count[1]);
//                    list.add(count[2]);
//                    list.sort((o1, o2) -> o1 - o2);
//                    set.add(list);
//                }
//                return;
//            }
//
//            for (int i = wei; i < nums.length; i++) {
//                if (!str[i]) {
//                    count[index] = nums[i];
//                    str[i] = true;
//                    DFS(nums, str, count, index + 1, i + 1);
//                    str[i] = false;
//
//                }
//            }
//        }
//    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            HashSet<List<Integer>> set = new HashSet<>();
            int len = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < len - 2 && nums[i] <= 0; i++) {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;
                // 寻找起点
                int left = i + 1, right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        set.add(temp);

//                        while (left < right && nums[left] == nums[left + 1]) left++;
//                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return new ArrayList<>(set);
        }

    }


}


