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
            a++; head = head.next;
        }
        return a;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode newhead = new ListNode(-1);
        ListNode newhead1 = newhead;
        int b = length(head)/k;
        if (head==null) return head;
        while(current!=null && b>0){
            Stack<Integer> stk = new Stack<>();
            int a = 0;
            while(current != null && a<k){
                stk.push(current.val);
                current = current.next; a++;
            }
            while(!stk.isEmpty()){
                // System.out.println(stk.peek());
                newhead1.next = new ListNode(stk.peek());
                stk.pop(); newhead1 = newhead1.next;
            }
            b--;
        }
        while(current!=null){
            newhead1.next = new ListNode(current.val);
            current = current.next; newhead1 = newhead1.next;
        }
        return newhead.next;
    }
}