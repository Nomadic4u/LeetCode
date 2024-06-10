import java.util.Arrays;

public class LeetCode_108 {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
             this.right = right;
          }
      }
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length == 0)
                return null;
            TreeNode node = new TreeNode();
            int mid = nums.length / 2;
            node.val = nums[mid];
            node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
            return node;
        }
    }
}
