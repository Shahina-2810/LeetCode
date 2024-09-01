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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode main = head;
        ListNode justback = head;
        ListNode last = head;

        int count = 1;
        if(head == null)return head;
        
        while(last.next!=null){
            count++;
            last = last.next;
        }
        if(count > 1 && k == 0 || count == k)return head;
        int pos = count - k % count;
        count = 1;
  
         last.next = head;
        while(main.next !=null && count<=pos){
            justback = main;
            main = main.next;
            count++;
        }
  
        justback.next = null;
        return main;
    }
}