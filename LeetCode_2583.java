import java.lang.reflect.Array;
import java.util.*;

public class LeetCode_2583 {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public long kthLargestLevelSum(TreeNode root, int k) {
            ArrayList<Long> arr = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if(root == null)
                return -1;
            queue.offer(root);
            while(!queue.isEmpty()) {
                int len = queue.size();
                Long count = 0L;
                for (int i = 0; i < len; i++) {
                    TreeNode node = queue.poll();
                    count += node.val;
                    if(node.left != null)
                        queue.offer(node.left);
                    if(node.right != null)
                        queue.offer(node.right);
                }
                arr.add(count);
            }
            if(arr.size() < k)
                return -1;
            Collections.sort(arr);
            System.out.println(arr);
            return arr.get(arr.size() - k );

        }
    }
}
