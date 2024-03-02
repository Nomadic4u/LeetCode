import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_103 {
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            boolean str = true;
            if(root == null)
                return list;
            queue.offer(root);
            while(!queue.isEmpty()) {
                List<Integer> temp = new ArrayList<>();
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    TreeNode node = queue.poll();
                    temp.add(node.val);

                    if(node.left != null)
                        queue.offer(node.left);
                    if(node.right != null)
                        queue.offer(node.right);
                }
                if(!str) {
                    List<Integer> temp_2 = new ArrayList<>();
                    for (int i = temp.size() - 1; i >= 0; i--) {
                        temp_2.add(temp.get(i));
                    }
                    list.add(temp_2);
                } else
                    list.add(temp);
                str = !str;
            }
            return list;
        }
    }
}
