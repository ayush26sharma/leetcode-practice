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
    public ListNode rotate(ListNode head){
        ListNode current = head.next;
        ListNode prev = head;
        while(current.next!=null){
            current = current.next;
            prev = prev.next;
        }
        ListNode newhead = new ListNode(current.val,head);
        prev.next = null;
        return newhead;
        
    }
    public int length(ListNode head){
        int a =0;
        while(head!=null){
            head = head.next; a++;
        }
        return a;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return null;
        if (head.next==null) return head;
        int a = k%length(head);
        ListNode newhead = head;
        for(int i = 0; i<a; i++){
            newhead = rotate(newhead);
        }
        return newhead;
    }
}