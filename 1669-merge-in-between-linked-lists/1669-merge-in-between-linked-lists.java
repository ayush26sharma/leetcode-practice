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
    
    public void remove(ListNode head, int a, int b){
        ListNode curr = head;
        int m = 0;
        while(curr!=null && m<a-1){
            m++;
            curr=curr.next;
        }
        // System.out.println("a "+ curr.val);
        ListNode curr1 = curr;
        while(curr1!=null && m<=b){
            m++;            
            curr1=curr1.next;
        }
        curr.next=curr1;
        // System.out.println("b "+curr1.val);
        
    }
    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        remove(list1,a,b);
        int m = 0;
        ListNode curr = list1;
        while(curr!=null && m<a-1){
            m++;
            curr=curr.next;
        }
        ListNode temp = curr.next;
        curr.next=list2;
        ListNode curr2 = list2;
        while(curr2.next!=null){
            curr2=curr2.next;
        }
        curr2.next=temp;
        return list1;
    }
}