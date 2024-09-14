import java.util.*;

public class LeetCode_146 {
    class LRUCache {
        class Node {
            int key;
            int value;
            Node preNode;
            Node nextNode;

            public Node() {
            }

            ;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private HashMap<Integer, Node> cache = new HashMap<>();
        private int size;
        private int capacity;
        private Node head, tail;

        public LRUCache(int capacity) {
            size = 0;
            this.capacity = capacity;
            head = new Node();
            tail = new Node();
            head.nextNode = tail;
            tail.preNode = head;
        }

        public int get(int key) {
            Node node = cache.get(key);
            if (node == null)
                return -1;
            else {
                moveToHead(node);
                return node.value;
            }
        }

        public void put(int key, int value) {
            Node node = cache.get(key);
            if (node == null) {
                Node new_node = new Node(key, value);
                cache.put(key, new_node);
                addToHead(new_node);
                size++;
                if (size > capacity) {
                    cache.remove(removeTail().key);
                    size--;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }
        }

        public void addToHead(Node node) {
            node.nextNode = head.nextNode;
            node.preNode = head;
            head.nextNode.preNode = node;
            head.nextNode = node;
        }

        public void removeNode(Node node) {
            node.preNode.nextNode = node.nextNode;
            node.nextNode.preNode = node.preNode;
        }

        public void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }

        public Node removeTail() {
            Node node = tail.preNode;
            removeNode(node);
            return node;
        }
    }
}
