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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n ; i++) {
            // Get into a window range.
            fast = fast.next;
        }

        // Since we need to access the before the target node 
        // It'll be safe for n equal to length of linked list.
        if (fast == null) return head.next;

        while (fast.next != null) {
            // Get into a position before target node.
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove target node from Linked List
        slow.next = slow.next.next;

        return head;
    }
}