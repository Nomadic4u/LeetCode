public class LeetCode_236_2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // 如果当前节点已经为p或q, 就不能再向下深入, 不然就会缺少其中一个节点
            if (root == null || root == p || root == q)
                return root;
            // 如果根节点不是p, q其中一个, 就向左右子树中寻找
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            // 当前左右子树都没有
            if (left == null && right == null)
                return null;
            if (left == null)
                return right;
            if (right == null)
                return left;
            // 此时左右子树都找到了p, q, 说明p, q分别在不同的左右子树上, 此时的公共祖先就是root
            return root;
        }
    }
}
