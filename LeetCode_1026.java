public class LeetCode_1026 {
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
        int max = -1;

        public int maxAncestorDiff(TreeNode root) {
            dfs(root, root.val, root.val);
            return max;
        }

        public void dfs(TreeNode node, int mx, int mn) {
            if (node == null) {
                return;
            }
            max = Math.max(max, Math.max(Math.abs(mx - node.val), Math.abs(mn - node.val)));
            mx = Math.max(mx, node.val);
            mn = Math.min(mn, node.val);
            dfs(node.left, mx, mn);
            dfs(node.right, mx, mn);
        }
    }
}
