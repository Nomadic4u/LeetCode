public class LeetCode_543 {
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
        public static int ans = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            ans = 1;
            DFS(root);
            return ans - 1;
        }

        public int DFS(TreeNode node) {
            if (node == null)
                return 0;

            // 当前node左树的最大深度
            int left = DFS(node.left);
            // 当前node右树的最大深度
            int right = DFS(node.right);
            // 更新最大长度
            ans = Math.max(ans, left + right + 1);
            return Math.max(left, right) + 1;
        }
    }
}
