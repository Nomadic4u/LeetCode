public class LeetCode_101 {
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

        boolean str = true;

        public boolean isSymmetric(TreeNode root) {
            if (root == null || (root.left == null && root.right == null))
                return true;
            reverse(root.right);
            check(root.left, root.right);
            return str;

        }

        public void reverse(TreeNode node) {
            if (node == null)
                return;
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            reverse(node.left);
            reverse(node.right);
        }

        public void check(TreeNode node_1, TreeNode node_2) {
            if (node_1 == null && node_2 == null)
                return;
            if ((node_1 == null && node_2 != null) || (node_1 != null && node_2 == null) || node_1.val != node_2.val) {
                str = false;
                return;
            }
            check(node_1.left, node_2.left);
            check(node_1.right, node_2.right);

        }
    }
}
