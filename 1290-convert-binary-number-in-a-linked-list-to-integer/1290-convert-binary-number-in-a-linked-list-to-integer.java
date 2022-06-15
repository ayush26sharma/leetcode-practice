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
        int a = 0;
        while(head!=null){
a++; head=head.next;}
        return a;
    }
    
    public int getDecimalValue(ListNode head) {
        int a = length(head)-1;
        int m = 0;
        while(head!=null){
            m += head.val*( (int) Math.pow(2,a));
            head=head.next; a--;
        }
        return m;
    }
}