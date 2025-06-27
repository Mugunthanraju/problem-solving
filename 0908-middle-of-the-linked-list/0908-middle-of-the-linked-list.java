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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // moves 1 step at a time
        ListNode fast = head; // moves 2 steps at a time

        while (fast != null && fast.next != null) {
            // Only care about fast & fast.next
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // At end of the loop, slow will be in middle
    }
}