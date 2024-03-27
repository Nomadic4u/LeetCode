import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_236 {
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
            Queue<TreeNode> queue = new LinkedList<>();
            TreeNode ans = new TreeNode(-1);
            queue.add(root);
            while (!queue.isEmpty()) {
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    TreeNode node = queue.poll();
                    if (DFS(node, p, q) == 2) {
                        ans.val = node.val;
//                        System.out.println("aaa:" + ans.val);
                    }
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
            return ans;

        }

        public int DFS(TreeNode node, TreeNode p, TreeNode q) {
            int cnt = 0;
            if (node == null) {
                return 0;
            }
            if (node.val == p.val || node.val == q.val) {
                cnt++;
            }
            return cnt + DFS(node.left, p, q) + DFS(node.right, p, q);

        }
    }
}
