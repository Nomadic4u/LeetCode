import com.sun.source.tree.Tree;

import java.util.HashMap;

public class LeetCode_98 {
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
        public boolean isValidBST(TreeNode root) {
            if (root == null || (root.left == null && root.right == null))
                return true;
            if (root.left == null)
                return judgeRight(root) && isValidBST(root.right);
            if (root.right == null)
                return judgeLeft(root) && isValidBST(root.left);
            return isValidBST(root.left) && isValidBST(root.right) && judgeLeft(root) && judgeRight(root);

        }

        public boolean judgeLeft(TreeNode node) {
            TreeNode temp = node.left;
            while (temp.right != null)
                temp = temp.right;
            return node.val > temp.val;
        }

        public boolean judgeRight(TreeNode node) {
            TreeNode temp = node.right;
            while (temp.left != null)
                temp = temp.left;
            return node.val < temp.val;
        }
    }
}
