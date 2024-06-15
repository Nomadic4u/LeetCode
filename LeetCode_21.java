public class LeetCode_21 {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null)
                return list2;
            if (list2 == null)
                return list1;
            ListNode res = list1.val < list2.val ? list1 : list2;
            res.next = mergeTwoLists(res.next, list1.val >= list2.val ? list1 : list2);
            return res;
        }
    }
}
