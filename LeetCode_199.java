import java.util.*;

/**
 * 先用层序遍历 然后取每一层的最后一个 组成一个list
 */
public class LeetCode_199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return list;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                Stack<Integer> stack = new Stack<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    stack.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);

                }
                list.add(stack.peek());
            }
            return list;
        }
    }
}
