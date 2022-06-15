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
    public ListNode removeElements(ListNode head, int val) {
        Queue<ListNode> q= new LinkedList<>();
        ListNode curr = head;
        while(curr!=null){
            if(curr.val!=val){
                q.offer(curr);
            }
            curr=curr.next;
        }
        ListNode newHead = new ListNode(-1);
        ListNode newHead1 = newHead;
        while(!q.isEmpty()){
            newHead.next = new ListNode(q.poll().val);
            newHead=newHead.next;
        }
        return newHead1.next;
    }
}