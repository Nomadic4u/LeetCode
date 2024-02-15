public class LeetCode_993 {
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
          private int x, y, d1, d2;
          private TreeNode p1, p2;

        public boolean isCousins(TreeNode root, int x, int y) {
            this.x = x;
            this.y = y;
            dfs(root, null, 0);
            return p1 != p2 && d1 == d2;
        }

        public void dfs(TreeNode node, TreeNode parent, int depth) {
            if(node == null)
                return;
            if(node.val == x) {
                d1 = depth;
                p1 = parent;
            } else if(node.val == y) {
                d2 = depth;
                p2 = parent;
            }

            dfs(node.left, node, depth + 1);
            dfs(node.right, node, depth + 1);
        }
    }
}
