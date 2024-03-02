import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_106 {
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


        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return dfs(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
        }

        public TreeNode dfs(int[] inorder, int[] postorder, int postEnd, int inStart, int inEnd) {
            if(inStart > inEnd) {
                return null;
            }
            TreeNode node = new TreeNode(postorder[postEnd]);
//            int index = list.indexOf(node.val);
            int index = 0;
            for (; index < inEnd; index++) {
                if(inorder[index] == node.val)
                    break;
            }

            node.left = dfs(inorder, postorder, postEnd - (inEnd - index + 1), inStart, index - 1);
            node.right = dfs(inorder, postorder, postEnd - 1, index + 1, inEnd);

            return node;

        }
    }
}
