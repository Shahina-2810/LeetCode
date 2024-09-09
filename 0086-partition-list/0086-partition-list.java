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
    public ListNode partition(ListNode head, int x) {
     ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode before_current = before;
        ListNode after_current = after;

        while(head != null) {
            if(head.val < x) { 
                before_current.next = head;
                before_current = before_current.next;
            } else { 
                after_current.next = head; 
                after_current = after_current.next;
            }
            head = head.next;
        }
        after_current.next = null;
        before_current.next = after.next;
        return before.next;   
    }
}