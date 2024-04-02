import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_894 {
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

    /**
     * 用纯递归的方式去做, 直接去构建左右子树
     */
    class Solution {
        public List<TreeNode> allPossibleFBT(int n) {
            List<TreeNode> list = new ArrayList<>();
            if (n == 1) {
                list.add(new TreeNode(0));
                return list;
            }
            for (int i = 1; i < n - 1; i += 2) {
                List<TreeNode> leftTree = allPossibleFBT(i);
                List<TreeNode> rightTree = allPossibleFBT(n - i - 1);
                for (int left = 0; left < leftTree.size(); left++) {
                    for (int right = 0; right < rightTree.size(); right++) {
                        TreeNode node = new TreeNode(0);
                        node.left = leftTree.get(left);
                        node.right = rightTree.get(right);
                        list.add(node);
                    }
                }
            }
            return list;
        }
    }
}
