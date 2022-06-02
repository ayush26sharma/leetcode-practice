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
        ListNode newHead = new ListNode(0);
        ListNode newHead1 = list1;
        ListNode newHead2 = list2;
        ListNode newHead3 = newHead;
        while(newHead1!=null && newHead2!=null){
            if(newHead1.val<newHead2.val){
                newHead.next = new ListNode(newHead1.val);
                newHead1=newHead1.next;
                newHead = newHead.next;
            }
            else{
                newHead.next = new ListNode(newHead2.val);
                newHead2=newHead2.next;
                newHead = newHead.next;
            }
        }
        while(newHead2!=null){
            newHead.next = new ListNode(newHead2.val);
            newHead2=newHead2.next;
            newHead = newHead.next;
        }
        while(newHead1!=null){
            newHead.next = new ListNode(newHead1.val);
            newHead1=newHead1.next;
            newHead = newHead.next;
        }
        return newHead3.next;
    }
}