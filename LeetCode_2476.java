import java.util.ArrayList;
import java.util.List;

public class LeetCode_2476 {
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
        public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
            List<List<Integer>> list = new ArrayList<>();
            for (Integer query : queries) {
                List<Integer> temp = new ArrayList<>();
                temp.add(find_min(root, query));
                temp.add(find_max(root, query));
                list.add(temp);
            }
            return list;
        }

        public Integer find_min(TreeNode node, Integer count) {
            if (node == null) {
                return -1;
            }

            if (node.val > count) {
                return find_min(node.left, count);
            } else if (node.val < count) {
                Integer minInRightSubtree = find_min(node.right, count);
                return minInRightSubtree != -1 ? Math.max(node.val, minInRightSubtree) : node.val;
            } else {
                return node.val;
            }
        }

        public Integer find_max(TreeNode node, Integer count) {
            if (node == null) {
                return -1;
            }

            if (node.val < count) {
                return find_max(node.right, count);
            } else if (node.val > count) {
                Integer maxInLeftSubtree = find_max(node.left, count);
                return maxInLeftSubtree != -1 ? Math.min(node.val, maxInLeftSubtree) : node.val;
            } else {
                return node.val;
            }
        }
    }
}
