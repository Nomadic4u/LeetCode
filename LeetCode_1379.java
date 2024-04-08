public class LeetCode_1379 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public static TreeNode res = null;

        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            func(cloned, target);
            return res;
        }

        public void func(TreeNode treeNode, final TreeNode target) {
            if (treeNode == null) {
                return;
            }
            if (treeNode.val == target.val) {
                res = treeNode;
            }
            func(treeNode.left, target);
            func(treeNode.right, target);
        }
    }
}
