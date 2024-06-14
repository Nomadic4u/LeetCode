import java.util.HashSet;
import java.util.List;


public class LeetCode_160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null)
                return null;
            ListNode index_A = headA;
            ListNode index_B = headB;
            while (index_A != index_B) {
                index_A = index_A == null ? headB : index_A.next;
                index_B = index_B == null ? headA : index_B.next;
            }
            return index_A;
        }
    }
}
