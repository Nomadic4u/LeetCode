public class LeetCode_105 {


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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return build(preorder, inorder, 0, 0, inorder.length - 1);
        }

        private TreeNode build(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
            if (inStart > inEnd) {
                return null;
            }
            TreeNode root = new TreeNode(preorder[preStart]);
            int inIndex = 0;
            for (int i = inStart;
                 i <= inEnd; i++) {
                if (inorder[i] == root.val) {
                    inIndex = i;
                    break;
                }
            }

            root.left =

                    build(preorder, inorder, preStart + 1, inStart, inIndex - 1);

            root.right =

                    build(preorder, inorder, preStart + inIndex - inStart + 1, inIndex + 1, inEnd);
            return root;

        }


    }


}