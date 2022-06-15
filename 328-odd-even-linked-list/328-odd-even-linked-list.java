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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode even1 = even;
        ListNode odd2 = odd;
        ListNode curr = head;
        if(head==null || head.next==null) return head;
        ListNode curr1 = head.next;
        while(curr!=null && curr.next!=null){
            odd.next=new ListNode(curr.val);
            curr=curr.next.next;
            odd=odd.next;
        }
        if(curr!=null){
            odd.next=new ListNode(curr.val);
            odd=odd.next;
        }
        
        System.out.println();
        while(curr1!=null && curr1.next!=null){
            even.next=new ListNode(curr1.val);
            curr1=curr1.next.next;
            even=even.next;
        }
        if(curr1!=null){
            even.next=new ListNode(curr1.val);
            even=even.next;
        }
        odd.next=even1.next;
        return odd2.next;
    }
}