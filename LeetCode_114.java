import com.sun.source.tree.Tree;

public class LeetCode_114 {
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
        public void flatten(TreeNode root) {
            DFS(root);
        }

        public void DFS(TreeNode node) {
            if(node == null)
                return;
            if (node.left == null)
                DFS(node.right);
            else {
                DFS(node.left);
                TreeNode temp = node.left;
                while(temp.right != null) {
                    temp = temp.right;
                }
                temp.right = node.right;
                node.right = node.left;
                node.left = null;
                DFS(node.right);
            }
        }
    }
}
