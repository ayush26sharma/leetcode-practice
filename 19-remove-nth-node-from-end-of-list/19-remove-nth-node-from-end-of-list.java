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
    public int length(ListNode head){
        if (head == null) return 0;
        ListNode current = head;
        int a = 0;
        while(current!=null){
            a++;
            current=current.next;
        }
        return a;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (length(head)==1) return null;
        int a = 0;
        int k = length(head)-n;
        ListNode curr = head;
        if (k!=a){
            while(a<k-1){
                curr = curr.next;
                a++;
            }
            curr.next = curr.next.next;
            return head;
        }
        return head.next;
    }
}