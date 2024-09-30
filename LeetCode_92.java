public class LeetCode_92 {
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
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode pre = new ListNode(0, head);
            ListNode index = pre;
            for (int i = 0; i < left - 1; i++) {
                index = index.next;
            }

            ListNode last = null;
            ListNode curr = index.next;
            for (int i = 0; i < right - left + 1; i++) {
                ListNode node = curr.next;
                curr.next = last;
                last = curr;
                curr = node;
            }

            index.next.next = curr;
            index.next = last;
            return pre.next;
        }
    }
}
