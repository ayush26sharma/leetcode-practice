/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next==null) return null;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow){
                slow = head;
                while(slow!=fast){
                    fast =fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}