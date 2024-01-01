import java.util.Arrays;

public class LeetCode_26 {

        public static  int removeDuplicates(int[] nums) {
            int len = nums.length;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] ==Integer.MAX_VALUE)
                    continue;
                for(int j = i + 1; j < nums.length && nums[i] == nums[j]; j++){
                    nums[j] = Integer.MAX_VALUE;
                    len --;
//                    i = j + 1;
                }
            }
            Arrays.sort(nums, 0, nums.length);
            return len;
        }
    public static void main(String[] args) {
        int nums[] = {1, 1};
        System.out.println(removeDuplicates(nums));
    }

}
