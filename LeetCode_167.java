import java.util.Arrays;

public class LeetCode_167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                int count = target - numbers[i];
                int index = Arrays.binarySearch(numbers, count);
                if (index < 0 || index == i)
                    continue;
                else {
                    int[] arr = new int[]{i + 1, index + 1};
                    Arrays.sort(arr);
                    return arr;
                }
            }
            return new int[]{};
        }
    }
}
