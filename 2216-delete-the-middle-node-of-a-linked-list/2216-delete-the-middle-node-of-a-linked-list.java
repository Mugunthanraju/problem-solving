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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = head; // Points node previous to target node

        while (fast != null && fast.next != null) {
            // We care about faat and fast.next
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow == fast) return head.next; // If Linked List has length of one

        previous.next = slow.next; // Eliminate targeted node 

        return head;
    }
}