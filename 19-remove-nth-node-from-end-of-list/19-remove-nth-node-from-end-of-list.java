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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode head1 = temp;
        ListNode head2 = head;
        for(int i = 1; i<n; i++){
            head2=head2.next;
        }
        while(head2.next!=null){
            head2=head2.next;
            head1=head1.next;
        }
        head1.next = head1.next.next;
        return temp.next;
    }
}