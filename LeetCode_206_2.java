public class LeetCode_206_2 {
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
        public ListNode reverseList(ListNode head) {
            if (head == null)
                return head;
            ListNode index = head.next;
            ListNode last = head;
            head.next = null;
            while (index != null) {
                ListNode temp = index.next;
                index.next = last;
                last = index;
                index = temp;
            }

            return last;
        }
    }
}
