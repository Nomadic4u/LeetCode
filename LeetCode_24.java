public class LeetCode_24 {
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
        public ListNode swapPairs(ListNode head) {
            if (head == null)
                return null;
            ListNode pre = new ListNode(0, head);
            reverse(pre);
            return pre.next;
        }

        public void reverse(ListNode node) {
            if (node == null || node.next == null || node.next.next == null)
                return;

            reverse(node.next.next);
            ListNode temp = node.next;
            node.next = node.next.next;
            temp.next = node.next.next;
            node.next.next = temp;

        }
    }
}
