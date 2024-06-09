import javax.naming.spi.DirStateFactory;

public class LeetCode_104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int deep = 0, max_deep = 0;

        public int maxDepth(TreeNode root) {
            DFS(root);
            return max_deep;
        }

        public void DFS(TreeNode node) {
            if (node == null)
                return;
            deep++;
            max_deep = Math.max(max_deep, deep);
            DFS(node.left);
            DFS(node.right);
            deep--;
        }
    }
}
