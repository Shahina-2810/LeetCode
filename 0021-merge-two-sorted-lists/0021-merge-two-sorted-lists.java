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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode list=new ListNode(-1);
        ListNode cur=list;
        while(list1!=null&& list2!=null){
            if(list1.val<=list2.val){
                list.next=list1;
                list=list.next;
                list1=list1.next;
            }
            else{
                 list.next=list2;
                list=list.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            list.next=list1;
            list=list.next;
            list1=list1.next;
        }
        while(list2!=null){
            list.next=list2;
            list=list.next;
            list2=list2.next;
        }
        return cur.next;
    }
}