public class LeetCode_25 {
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
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode pre_head = new ListNode(0, head);
            ListNode pre = pre_head;
            ListNode end = pre_head;
            while (end.next != null) {
                for (int i = 0; i < k && end != null; i++)
                    end = end.next;
                if (end == null)
                    break;
                ListNode start = pre.next;
                ListNode next_start = end.next;
                end.next = null;
                pre.next = reverse(start);
                start.next = next_start;
                pre = start;
                end = pre;
            }
            return pre_head.next;
        }

        public ListNode reverse(ListNode start) {
            ListNode pre = null;
            ListNode curr = start;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            return pre;
        }
    }
}
