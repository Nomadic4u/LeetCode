public class LeetCode_2 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode index_1 = l1;
            ListNode index_2 = l2;

            ListNode head = new ListNode();
            ListNode index_3 = head;
            int str = 0;
            while (index_1 != null && index_2 != null) {
                int num = index_1.val + index_2.val + str;
                str = 0;
                if (num >= 10) {
                    num -= 10;
                    str = 1;
                }

                ListNode temp = new ListNode(num);
                index_3.next = temp;
                index_3 = index_3.next;
                index_1 = index_1.next;
                index_2 = index_2.next;
            }

            while (index_1 != null) {
                int num = index_1.val + str;
                str = 0;
                if (num >= 10) {
                    num -= 10;
                    str = 1;
                }
                ListNode temp = new ListNode(num);
                index_3.next = temp;
                index_3 = index_3.next;
                index_1 = index_1.next;
            }


            while (index_2 != null) {
                int num = index_2.val + str;
                str = 0;
                if (num >= 10) {
                    num -= 10;
                    str = 1;
                }
                ListNode temp = new ListNode(num);
                index_3.next = temp;
                index_3 = index_3.next;
                index_2 = index_2.next;
            }

            if (str == 1) {
                ListNode temp = new ListNode(1);
                index_3.next = temp;
            }

            return head.next;
        }
    }
}
