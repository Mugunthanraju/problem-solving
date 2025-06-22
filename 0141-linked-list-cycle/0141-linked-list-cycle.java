/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // Two Pointers - Fast and Slow Pattern (also called the Tortoise and Hare algorithm

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // moves one step at a time
            fast = fast.next.next; // moves two steps at a time

            // If condition is true - then cycle detected
            if (slow == fast) return true;
        }

        return false;
    }
}