import javax.swing.tree.TreeNode;
//给你一棵 完美 二叉树的根节点 root ，请你反转这棵树中每个 奇数 层的节点值。
//
//例如，假设第 3 层的节点值是 [2,1,3,4,7,11,29,18] ，那么反转后它应该变成 [18,29,11,7,4,3,1,2] 。
//反转后，返回树的根节点。
//
//完美 二叉树需满足：二叉树的所有父节点都有两个子节点，且所有叶子节点都在同一层。
//
//节点的 层数 等于该节点到根节点之间的边数。
//
//
public class LeetCode_2415 {
    class TreeNode {
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
        public TreeNode reverseOddLevels(TreeNode root) {
            Dfs(root.left, root.right, true);
            return root;
        }

        private void Dfs(TreeNode root_left, TreeNode root_right, boolean str) {
            if (root_left == null)
                return ;
            if (str) {
                // 当前层为奇数层
                int temp = root_left.val;
                root_left.val = root_right.val;
                root_right.val = temp;
            }
            Dfs(root_left.left, root_right.right, !str);
            Dfs(root_left.right, root_right.left, !str);
        }
    }
}
