/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode mergeKLists(ListNode[] lists) {

    PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

    // Add first node of every list
    for (ListNode head : lists) {
        if (head != null) {
            pq.offer(head);
        }
    }

    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;

    while (!pq.isEmpty()) {

        // Get smallest node
        ListNode curr = pq.poll();

        temp.next = curr;
        temp = temp.next;

        // Add next node from same list
        if (curr.next != null) {
            pq.offer(curr.next);
        }
    }

    return dummy.next;
}
}