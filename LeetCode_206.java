public class LeetCode_206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        ListNode tail;

        public ListNode reverseList(ListNode head) {
            if (head == null)
                return head;
            reverse(head);
            head.next = null;
            return tail;
        }

        public void reverse(ListNode node) {
            if (node.next == null) {
                tail = node;
                return;
            }
            reverse(node.next);
            node.next.next = node;
        }
    }
}
