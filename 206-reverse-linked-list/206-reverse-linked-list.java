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
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(currentNode != null){
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }
        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while(!stack.isEmpty()){
            newHead.next = new ListNode(stack.peek());
            newHead = newHead.next;
            stack.pop();
        }
        return curr.next;
    }
}