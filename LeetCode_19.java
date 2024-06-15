public class LeetCode_19 {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dunmy = new ListNode(0, head);
            ListNode first = head;
            ListNode last = dunmy;
            for (int i = 1; i <= n; i++)
                first = first.next;

            while (first != null) {
                first = first.next;
                last = last.next;
            }

            last.next = last.next.next;
            return dunmy.next;
        }
    }
}
