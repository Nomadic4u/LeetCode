import com.sun.source.tree.Tree;

public class LeetCode_226 {
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
        public TreeNode invertTree(TreeNode root) {
            DFS(root);
            return root;
        }

        public void DFS(TreeNode node) {
            if (node == null)
                return;
            DFS(node.left);
            DFS(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}
