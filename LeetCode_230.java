import java.util.LinkedList;
import java.util.List;

public class LeetCode_230 {
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
        List<Integer> list = new LinkedList<>();

        public int kthSmallest(TreeNode root, int k) {
            DFS(root);
            return list.get(k - 1);
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
