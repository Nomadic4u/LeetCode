import java.util.List;

public class LeetCode_82 {
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode new_head = new ListNode();
            ListNode index;
            index = new_head;
            ListNode temp = head;
            ListNode last = new ListNode(-111, head);
            while(temp != null) {
                if(temp.val == last.val) {
                    temp =  temp.next;
                    last = last.next;
                } else if(temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                    last = last.next;
                } else {
                    if(new_head.next == null) {
                        new_head.next = new ListNode(temp.val);
                        index = new_head.next;
                    } else {
                index.next = new ListNode(temp.val);
                       index.next = new ListNode(temp.val);
                        index = index.next;
                    }
                    temp = temp.next;
                    last = last.next;
                }
            }
            return new_head.next;
        }
    }
}
