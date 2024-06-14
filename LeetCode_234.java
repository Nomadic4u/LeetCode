import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_234 {
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

        public boolean isPalindrome(ListNode head) {
            List<Integer> list_1 = new LinkedList<>();
            ListNode index = head;
            while (index != null) {
                list_1.add(index.val);
                index = index.next;
            }

            reverse(head);
            head.next = null;

            List<Integer> list_2 = new LinkedList<>();
            index = tail;
            while (index != null) {
                list_2.add(index.val);
                index = index.next;
            }
            return list_1.equals(list_2);

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
