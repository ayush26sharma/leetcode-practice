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
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(-1);
        ListNode current = head;
        ListNode new_curr = newHead;
        while(current!=null){
            int m = 0;
            Stack<Integer> stk = new Stack<>();
            while(current!=null&& m<2){
                stk.push(current.val);
                current=current.next;
                m++;
            }
            while(!stk.isEmpty()){
                new_curr.next = new ListNode(stk.pop());
                new_curr = new_curr.next;
            }
        }
        return newHead.next;
    }
}