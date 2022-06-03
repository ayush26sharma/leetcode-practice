/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int a = 0;
        while(head!=null){
            head = head.next;
            a++;
        }
        return a;
    }
        
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int k = Math.abs(length(headA)-length(headB));
        if(length(headA)>length(headB)){
            while(k!=0){
                headA=headA.next;
                k--;
            }
        }
        else{
            while(k!=0){
                headB=headB.next;
                k--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}