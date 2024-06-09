import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {
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

        List<Integer> list = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            DFS(root);
            return list;
        }

        public void DFS(TreeNode node) {
            if (node == null)
                return;
            DFS(node.left);
            list.add(node.val);
            DFS(node.right);
        }
    }
}
