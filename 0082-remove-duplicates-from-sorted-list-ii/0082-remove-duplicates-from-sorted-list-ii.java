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
    public ListNode deleteDuplicates(ListNode head) {
     if (head == null) return null;  // Edge case: If the list is empty, return null
        
        ListNode dummy = new ListNode(0);  // Dummy node to handle cases where head has duplicates
        dummy.next = head;
        ListNode prev = dummy;  // Pointer to the last node that is guaranteed to be distinct
        
        while (head != null) {
            // If we have found the beginning of duplicates sublist 
            // skip all the nodes in this duplicate sublist
            if (head.next != null && head.val == head.next.val) {
                // Move the head pointer to the end of duplicates sublist
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip all duplicates
                prev.next = head.next;
            } else {
                // Otherwise, move the prev pointer
                prev = prev.next;
            }
            // Move forward
            head = head.next;
        }
        
        return dummy.next;  //return list    
    }
}