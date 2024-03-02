import java.util.ArrayList;
import java.util.List;

public class LeetCode_589 {
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(Node root) {
           dfs(root);
           return list;
        }

        public void dfs(Node node) {
            if(node == null) {
                return;
            }
            list.add(node.val);
            for (int i = 0; i < node.children.size(); i++) {
                dfs(node.children.get(i));
            }
        }

    }
}
