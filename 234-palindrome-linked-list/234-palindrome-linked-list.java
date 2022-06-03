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
    public boolean isPalindrome(ListNode head) {
        ListNode newhead = head;
        Stack<Integer> stk = new Stack<>();
        while(newhead!=null){
            stk.push(newhead.val);
            newhead=newhead.next;
        }
        while(!stk.isEmpty()){
            if (stk.peek()!=head.val) return false;
            stk.pop(); head=head.next;
        }
        return true;
    }
}