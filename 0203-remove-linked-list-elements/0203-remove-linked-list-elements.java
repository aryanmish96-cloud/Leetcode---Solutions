class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {

            if (current.next.val == val) {
                // Skip the node containing val
                current.next = current.next.next;
            } else {
                // Move forward only when no deletion happens
                current = current.next;
            }
        }

        return dummy.next;
    }
}