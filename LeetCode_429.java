import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_429 {
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
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> list = new ArrayList<>();
            Queue<Node> queue = new LinkedList<>();
            if(root == null)
                return list;
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> temp = new ArrayList<>();
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    Node node = queue.poll();
                    temp.add(node.val);

                    queue.addAll(node.children);

                }
                list.add(temp);
            }
            return list;
        }
    }
}
