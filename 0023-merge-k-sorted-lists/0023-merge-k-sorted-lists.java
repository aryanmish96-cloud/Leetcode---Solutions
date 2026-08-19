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

    List<Integer> values = new ArrayList<>();

    // Store all node values
    for (ListNode head : lists) {
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
    }

    // Sort all values
    Collections.sort(values);

    // Create merged linked list
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;

    for (int value : values) {
        temp.next = new ListNode(value);
        temp = temp.next;
    }

    return dummy.next;
}
}